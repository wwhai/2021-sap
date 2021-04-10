package com.emqx.datatunnel;

import java.sql.Time;

public class Device {
     Integer id;
     String name;
     String model;
     int type;
     String sn;
     String simcard;
     String pos;
     String info;
     String area;
     Time create_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSimcard() {
        return simcard;
    }

    public void setSimcard(String simcard) {
        this.simcard = simcard;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Time getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Time create_at) {
        this.create_at = create_at;
    }
}