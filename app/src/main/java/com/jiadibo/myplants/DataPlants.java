package com.jiadibo.myplants;

import java.util.ArrayList;

public class DataPlants {
    private static String[] plantsName = {
            "Tanaman Tin",
            "Gingseng Jawa",
            "Kumis Kucing",
            "Bugenvil Putih",
            "Keji Beling",
            "Daun Sirih",
            "Tanaman Sembung",
            "Buah Ajaib",
            "Kumquat Nagami",
            "Pukul Empat",
    };

    private static String[] info = {
            "info",
            "info",
            "info",
            "info",
            "info",
            "info",
            "info",
            "info",
            "info",
            "info",
    };

    private static int[] age = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
    };

    static ArrayList<Plants> getListData() {
        ArrayList<Plants> list = new ArrayList<>();
        for (int position = 0; position < plantsName.length; position++){
            Plants plants = new Plants();
            plants.setName(plantsName[position]);
            plants.setInfo(info[position]);
            plants.setAge(age[position]);
            list.add(plants);
        }

        return list;
    };
}
