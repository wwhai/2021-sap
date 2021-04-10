package com.emqx.datatunnel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenCsv {

    public static void main(String[] args) throws IOException {
        // 厂区 产品 设备 数据 时间
        StringBuilder header = new StringBuilder("\"area\", \"product\", \"device\", \"type\", \"data\", \"create_date\" \n");
        int rangeMin = 240;
        int rangeMax = 380;
        Random r = new Random();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        long startTime = 0;
        long endTime = 0;
        try {
            startTime = format.parse("2015-01-01").getTime();
            endTime = format.parse("2020-12-31").getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 一天的时间
        long day = 1000 * 60 * 60 * 24;
        String[] areas = new String[]{"东部厂区,", "西部厂区,", "南部厂区,", "北面部厂区,"};
        for (long i = startTime; i <= endTime; i += day) {
            String date = format.format(new Date(i));
            String value1 = (int) (rangeMin + (rangeMax - rangeMin) * r.nextFloat()) + ",";
            String value2 = (int) (rangeMin + (rangeMax - rangeMin) * r.nextFloat()) + ",";
            String value3 = (int) (rangeMin + (rangeMax - rangeMin) * r.nextFloat()) + ",";
            String value4 = (int) (rangeMin + (rangeMax - rangeMin) * r.nextFloat()) + ",";
            for (String area : areas) {
                String line1 = area + "水表系列产品," + 1 + ",水表1," + value1 + date + "\n";
                String line2 = area + "电表系列产品," + 2 + ",电表1," + value2 + date + "\n";
                String line3 = area + "气压表系列产品," + 3 + ",气压表1," + value3 + date + "\n";
                String line4 = area + "燃气表系列产品," + 4 + ",燃气表1," + value4 + date + "\n";
                header.append(line1).append(line2).append(line3).append(line4);

            }

        }
        writeCsv(header.toString());
    }

    static void writeCsv(String content) throws IOException {
        File file = new File("./emqx_spa_data.csv");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(content + "\n");
        out.flush();
        out.close();
    }

}
