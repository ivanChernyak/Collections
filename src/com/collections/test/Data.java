package com.collections.test;

public class Data {

    public static String[] generateData(int count) {
        String[] temp = new String[count];

        for (int i = 0; i < count; i++) {
            temp[i] = "DATA" + i;
        }

        return temp;
    }
}
