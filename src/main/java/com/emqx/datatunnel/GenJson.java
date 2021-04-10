package com.emqx.datatunnel;

import com.alibaba.fastjson.JSONObject;

import java.sql.Date;
import java.sql.Time;

public class GenJson {

    public static void main(String[] args) {
        Device device = new Device();
        device.id = 1;
        device.name = "1号燃气表";
        device.model = "ABC001";
        device.type = 1;
        device.sn = "2020-nvbHJNBVGFYHUJ";
        device.simcard = "13388888888";
        device.pos = "120,34'-89,45'";
        device.info = "这是个电表";
        device.area = "某公司东区1号厂房";
        device.create_at = new Time(System.currentTimeMillis());
        //
        Data data = new Data();
        data.id = 1;
        data.data_value = 123.45;
        data.threshold = 100.01;
        data.create_at = new Time(System.currentTimeMillis());
        System.out.println(JSONObject.toJSON(device));
        System.out.println(JSONObject.toJSON(data));
        //
        Event event = new Event();
        event.id = 1;
        event.name = "警告信息";
        event.type = 1;
        event.device_id = 1;
        event.info = "设备【1】电压过高，请及时处理";
        event.create_at = new Time(System.currentTimeMillis());
        System.out.println(JSONObject.toJSON(event));
    }
}
