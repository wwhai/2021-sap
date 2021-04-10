package com.emqx.datatunnel;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import spark.Spark;

import java.sql.*;

public class Main {
    static Connection connection;

    static {
        connection = connectHana();
    }

    public static void main(String[] args) {
        startWebServer();
        connectEmqx();

    }

    public static void startWebServer() {
        Spark.port(8888);
        Spark.get("/api/current", (req, rep) -> {
            JSONObject bigJson = new JSONObject();
            try {
                String sql = "SELECT top 5 * FROM EMQX_SPA_DATA where device_name = 'water_power_1' order by create_at desc";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                resultSet.next();
                JSONArray a1 = new JSONArray();
                JSONArray a2 = new JSONArray();
                JSONArray a3 = new JSONArray();
                JSONArray a4 = new JSONArray();
                do {
//
//                    JSONObject dataJson = new JSONObject();
//                    Integer id = resultSet.getInt("id");
//                    dataJson.put("ID", id);

                    Integer device_id = resultSet.getInt("device_id");
//                    dataJson.put("DEVICE_ID", device_id);

                    Float value = resultSet.getFloat("data_value");
//                    int rangeMin = 240;
//                    int rangeMax = 380;
//                    Random r = new Random();
//                    String value = rangeMin + (rangeMax - rangeMin) * r.nextFloat() + "";
//                    dataJson.put("DATA_VALUE", value);
//
//                    String device_name = resultSet.getString("device_name");
//                    dataJson.put("DEVICE_NAME", device_name);
//
//                    String info = resultSet.getString("threshold");
//                    dataJson.put("THRESHOLD", info);
//
//                    String create_at = resultSet.getString("create_at");
//                    dataJson.put("CREATE_AT", create_at);
                    if (device_id == 1) {
                        a1.add(value);
                    }
                    if (device_id == 2) {
                        a2.add(value);

                    }
                    if (device_id == 3) {
                        a3.add(value);

                    }
                    if (device_id == 4) {
                        a4.add(value);

                    }
                } while (resultSet.next());
                statement.close();
                bigJson.put("1", a1);
                bigJson.put("2", a2);
                bigJson.put("3", a3);
                bigJson.put("4", a4);
                return bigJson.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        });
        //
        Spark.get("/api/events", (request, response) -> {
            try {
                Statement statement = connection.createStatement();
                String sql = "select * from emqx_spa_event order by create_at desc limit 100 offset 0";
                ResultSet resultSet = statement.executeQuery(sql);
                JSONArray resultArray = new JSONArray();
                resultSet.next();
                //
                do {
                    JSONObject dataJson = new JSONObject();
                    Integer id = resultSet.getInt("id");
                    dataJson.put("ID", id);
                    Integer type = resultSet.getInt("type");
                    dataJson.put("TYPE", type);

                    Integer device_id = resultSet.getInt("device_id");
                    dataJson.put("DEVICE_ID", device_id);

                    Float value = resultSet.getFloat("value");
                    dataJson.put("VALUE", value);

                    String device_name = resultSet.getString("device_name");
                    dataJson.put("DEVICE_NAME", device_name);

                    String name = resultSet.getString("name");
                    dataJson.put("NAME", name);

                    String info = resultSet.getString("info");
                    dataJson.put("INFO", info);

                    String create_at = resultSet.getString("create_at");
                    dataJson.put("CREATE_AT", create_at);

                    resultArray.add(dataJson);
                } while (resultSet.next());
                statement.close();
                return resultArray.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        });

        System.out.println("Web Server start success!");

    }

    static void connectEmqx() {
        String broker = "tcp://122.112.225.20:1883";
        String clientId = "emqx-sap-java-client";
        MemoryPersistence persistence = new MemoryPersistence();
        // MQTT 连接选项
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setUserName("emqx-sap-java-client");
        connOpts.setPassword("emqx-sap-java-client".toCharArray());
        // 保留会话
        connOpts.setCleanSession(true);

        try {
            MqttClient client = new MqttClient(broker, clientId, persistence);
            // 设置回调
            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable throwable) {
                    throwable.printStackTrace();

                }

                @Override
                public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
//                    System.out.println(mqttMessage.toString());

                    JSONObject data = JSONObject.parseObject(mqttMessage.toString());

                    try {
                        JSONArray teleArray = data.getJSONArray("tele");
                        for (Object o : teleArray) {
                            JSONObject json = (JSONObject) o;
                            String objn = json.getString("objn");
                            //水表 {"objn":"water_power_1","tstp":1617883993,"water":203}
                            if (objn.startsWith("water_power_")) {
                                //System.out.println("水表");
                                Statement statement = connection.createStatement();
                                String sql = "insert INTO emqx_spa_data values (0, $DID , '$DNAME', $VALUE, $VALUE, CURRENT_TIMESTAMP);";
                                statement.execute(sql.replace("$DID", objn.split("_")[2] + "")
                                        .replace("$VALUE", json.getString("water")).replace("$DNAME", objn));

                            }
                            //电表 {"objn":"electricity_electricity meter_3","electricity":8,"tstp":1617883993}
                            if (objn.startsWith("electricity_electricity meter_")) {
                                //System.out.println("电表");
                                Statement statement = connection.createStatement();
                                String sql = "insert INTO emqx_spa_data values (0, $DID , '$DNAME', $VALUE, $VALUE, CURRENT_TIMESTAMP);";
                                statement.execute(sql.replace("$DID", objn.split("_")[2] + "")
                                        .replace("$VALUE", json.getInteger("electricity") + "").replace("$DNAME", objn));
                            }
                            // 燃气表 {"p":10,"objn":"gas_gas_meter_1","tstp":1617883993}
                            if (objn.startsWith("gas_gas_meter_")) {
                                //System.out.println("燃气表");
                                Statement statement = connection.createStatement();
                                String sql = "insert INTO emqx_spa_data values (0, $DID , '$DNAME', $VALUE, $VALUE, CURRENT_TIMESTAMP);";
                                statement.execute(sql.replace("$DID", objn.split("_")[3] + "")
                                        .replace("$VALUE", json.getInteger("p") + "").replace("$DNAME", objn));
                            }
                            // 空气表 {"q":8,"objn":"air_air_meter_2","tstp":1617883993}
                            if (objn.startsWith("air_air_meter_")) {
                                //System.out.println("空气表");
                                Statement statement = connection.createStatement();
                                String sql = "insert INTO emqx_spa_data values (0, $DID , '$DNAME', $VALUE, $VALUE, CURRENT_TIMESTAMP);";
                                statement.execute(sql.replace("$DID", objn.split("_")[3] + "")
                                        .replace("$VALUE", json.getInteger("q") + "").replace("$DNAME", objn));
                            }
                            //System.out.println(o.toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

                }
            });

            client.connect(connOpts);
            System.out.println("Connect to EMQX success!");

            // 订阅
            client.subscribe("Neuron/Telemetry/#");

        } catch (MqttException me) {
            //System.out.println("Connect to EMQX failed!");

            me.printStackTrace();
        }
    }

    static Connection connectHana() {
        try {
            System.out.println("Connect to hana success!");
            return DriverManager.getConnection(
                    "jdbc:sap://225402d4-d139-4f4e-9e01-951fd4c07b12.hana.prod-cn40.hanacloud.sapcloud.cn:443",
                    "DBADMIN",
                    "EMQX123ok");
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Connect to hana failed!");

            return null;
        }
    }
}