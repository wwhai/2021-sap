package com.emqx.datatunnel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenSql {
    public static void main(String[] args) throws IOException {

        genEvent();
        gen2();

    }

    static void gen2() throws IOException {
        //生成插入数据的SQL
        //insert INTO emqx_spa_data (1, 1, 1, 1, CURRENT_TIMESTAMP);
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 3; j++) {
                String sql = "insert INTO emqx_spa_data values ($ID, $DID, '设备:$N' ,$V, $T, CURRENT_TIMESTAMP);";
                float rangeMin = 240;
                float rangeMax = 380;
                Random r = new Random();
                String v = rangeMin + (rangeMax - rangeMin) * r.nextDouble() + "";
                String t = rangeMin + (rangeMax - rangeMin) * r.nextDouble() + "";
                String sql1 = (sql.replace("$ID", (i * 10 + j + 1) + "")
                        .replace("$DID", (i + 1) + "")
                        .replace("$V", v)
                        .replace("$T", t));
                if ((i + 1) == 1) {
                    sql1 = sql1.replace("$N", "电表:" + (i + 1));
                    writeSql(sql1);

                }
                if ((i + 1) == 2) {
                    sql1 = sql1.replace("$N", "水表:" + (i + 1));
                    writeSql(sql1);

                }
                if ((i + 1) == 3) {
                    sql1 = sql1.replace("$N", "燃气表:" + (i + 1));
                    writeSql(sql1);

                }
                if ((i + 1) == 4) {
                    sql1 = sql1.replace("$N", "空气压强表:" + (i + 1));
                    writeSql(sql1);
                }

            }

        }
    }

    static void writeSql(String sql) throws IOException {
        File file = new File("./insert_data.sql");
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        out.write(sql + "\n");
        out.flush();
        out.close();
    }


    static void writeSqlEvent(String sql) throws IOException {
        File file = new File("./insert_event.sql");
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        out.write(sql + "\n");
        out.flush();
        out.close();
    }

    static void genEvent() throws IOException {
        // 生成插入事件的SQL
        //insert INTO emqx_spa_event values ($ID, $TYPE, $DID, $N, $I, CURRENT_TIMESTAMP);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10000; j++) {
                int rangeMin = 240;
                int rangeMax = 380;
                Random r = new Random();
                String v = rangeMin + (rangeMax - rangeMin) * r.nextFloat() + "";
                String sql = "insert INTO emqx_spa_event values ($ID, $TYPE, $DID, $VVV,'$AME', '$N', '$I', CURRENT_TIMESTAMP);";
                String sql1 = (sql.replace("$ID", (i * 10 + j + 1) + "")
                        .replace("$DID", (i + 1) + "")
                        .replace("$TYPE", type(i * 10 + j + 1) + "")
                        .replace("$I", info(i * 10 + j + 1))
                        .replace("$VVV", v)
                        .replace("$N", name(i * 10 + j + 1)));

                if ((i + 1) == 1) {
                    sql1 = sql1.replace("$AME", "电表:" + (i + 1));
                    writeSqlEvent(sql1);

                }
                if ((i + 1) == 2) {
                    sql1 = sql1.replace("$AME", "水表:" + (i + 1));
                    writeSqlEvent(sql1);

                }
                if ((i + 1) == 3) {
                    sql1 = sql1.replace("$AME", "燃气表:" + (i + 1));
                    writeSqlEvent(sql1);

                }
                if ((i + 1) == 4) {
                    sql1 = sql1.replace("$AME", "空气压强表:" + (i + 1));
                    writeSqlEvent(sql1);
                }
            }

        }
    }

    static int type(int i) {
        if (i % 5 == 0) return 1;
        return 0;
    }

    static String info(int i) {
        if (i % 5 == 0) return "设备出现告警，请尽快处理";
        return "这是普通事件";
    }


    static String name(int i) {
        if (i % 5 == 0) return "告警事件";
        return "普通事件";
    }
}
