package com.collections.test;

import java.util.*;

public class Main {

    private static final int DATA_AMOUNT = 1000000;
    private static final int START_INDEX = 0;
    private static final int END_INDEX = 10000;

    public static void main(String[] args) {

        String[] data = Data.generateData(DATA_AMOUNT);
        Result result = new Result();

        List<String> list = new ArrayList<>();
        result.setArrayListTime(listTest(list, data, START_INDEX, END_INDEX));
        list.clear();
        list = new LinkedList<>();
        result.setLinkedListTime(listTest(list, data, START_INDEX, END_INDEX));

        Set<String> set = new HashSet<>();
        result.setHashSetTime(setTest(set, data, START_INDEX, END_INDEX));
        set.clear();
        set = new TreeSet<>();
        result.setTreeSetTime(setTest(set, data, START_INDEX, END_INDEX));

        Map<Integer, String> map = new HashMap<>();
        result.setHashMapTime(mapTest(map, data, START_INDEX, END_INDEX));
        map.clear();
        map = new TreeMap<>();
        result.setTreeMapTime(mapTest(map, data, START_INDEX, END_INDEX));

        result.buildTable();
    }

    private static long[] listTest(List<String> list, String[] data, int startIndex, int endIndex){
        long[] collectionsTime = new long[3];
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        Operations.addDataToList(list, data);
        endTime = System.currentTimeMillis();
        collectionsTime[0] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.getDataFromList(list, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[1] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.removeDataFromList(list, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[2] = endTime - startTime;

        return collectionsTime;
    }

    private static long[] setTest(Set<String> set, String[] data, int startIndex, int endIndex){
        long[] collectionsTime = new long[3];
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        Operations.addDataToSet(set, data);
        endTime = System.currentTimeMillis();
        collectionsTime[0] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.getDataFromSet(set, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[1] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.removeDataFromSet(set, data, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[2] = endTime - startTime;

        return collectionsTime;
    }

    private static long[] mapTest(Map<Integer,String> map, String[] data, int startIndex, int endIndex){
        long[] collectionsTime = new long[3];
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        Operations.addDataToMap(map, data);
        endTime = System.currentTimeMillis();
        collectionsTime[0] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.getDataFromMap(map, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[1] = endTime - startTime;

        startTime = System.currentTimeMillis();
        Operations.removeDataFromMap(map, startIndex, endIndex);
        endTime = System.currentTimeMillis();
        collectionsTime[2] = endTime - startTime;

        return collectionsTime;
    }
}
