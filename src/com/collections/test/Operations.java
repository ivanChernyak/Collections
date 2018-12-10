package com.collections.test;

import java.util.*;

public class Operations {

    public static void addDataToList(List<String> list, String[] data) {
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);

        }
    }

    public static void getDataFromList(List<String> list, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            list.get(i);

        }
    }

    public static void removeDataFromList(List<String> list, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            list.remove(i);

        }
    }

    public static void addDataToSet(Set<String> set, String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    public static void getDataFromSet(Set<String> set, int startIndex, int endIndex) {
        int i = startIndex;
        Iterator iterator = set.iterator();
        while (iterator.hasNext() && i < endIndex){
            iterator.next();
            i++;
        }
    }

    public static void removeDataFromSet(Set<String> set, String[] data,int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            set.remove(data[i]);
        }
    }

    public static void addDataToMap(Map<Integer,String> map, String[] data) {
        for (int i = 0; i < data.length; i++) {
            map.put(i, data[i]);
        }
    }

    public static void getDataFromMap(Map<Integer,String> map, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            map.get(i);
        }
    }

    public static void removeDataFromMap(Map<Integer,String> map, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            map.remove(i);
        }
    }

}
