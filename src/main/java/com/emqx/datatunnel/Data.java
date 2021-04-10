package com.emqx.datatunnel;

import java.sql.Time;

public class Data {
    Integer id;
    Double data_value;
    Double threshold;
    Time create_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getData_value() {
        return data_value;
    }

    public void setData_value(Double data_value) {
        this.data_value = data_value;
    }

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Time getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Time create_at) {
        this.create_at = create_at;
    }
}
