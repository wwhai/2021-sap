package com.emqx.datatunnel;

import java.sql.Time;

public class Event {
    Integer id;
    int type;
    String name;
    Integer device_id;
    String info;
    Time create_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Time getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Time create_at) {
        this.create_at = create_at;
    }
}
