package com.collections.test;

public class Result {

    private long[] ArrayListTime;
    private long[] LinkedListTime;
    private long[] HashSetTime;
    private long[] TreeSetTime;
    private long[] HashMapTime;
    private long[] TreeMapTime;

    public long[] getArrayListTime() {
        return ArrayListTime;
    }

    public void setArrayListTime(long[] arrayListTime) {
        ArrayListTime = arrayListTime;
    }

    public long[] getLinkedListTime() {
        return LinkedListTime;
    }

    public void setLinkedListTime(long[] linkedListTime) {
        LinkedListTime = linkedListTime;
    }

    public long[] getHashSetTime() {
        return HashSetTime;
    }

    public void setHashSetTime(long[] hashSetTime) {
        HashSetTime = hashSetTime;
    }

    public long[] getTreeSetTime() {
        return TreeSetTime;
    }

    public void setTreeSetTime(long[] treeSetTime) {
        TreeSetTime = treeSetTime;
    }

    public long[] getHashMapTime() {
        return HashMapTime;
    }

    public void setHashMapTime(long[] hashMapTime) {
        HashMapTime = hashMapTime;
    }

    public long[] getTreeMapTime() {
        return TreeMapTime;
    }

    public void setTreeMapTime(long[] treeMapTime) {
        TreeMapTime = treeMapTime;
    }

    public void buildTable() {
        System.out.println("Collection \t\t\tAdd\t\t\tGet\t\tRemove");
        System.out.println("----------------------------------------------");
        System.out.printf("ArrayList \t%10d \t%10d \t%10d\n", ArrayListTime[0], ArrayListTime[1], ArrayListTime[2]);
        System.out.printf("LinkedList \t%10d \t%10d \t%10d\n", LinkedListTime[0], LinkedListTime[1], LinkedListTime[2]);

        System.out.printf("HashSet \t%10d \t%10d \t%10d\n", HashSetTime[0], HashSetTime[1], HashSetTime[2]);
        System.out.printf("TreeSet \t%10d \t%10d \t%10d\n", TreeSetTime[0], TreeSetTime[1], TreeSetTime[2]);

        System.out.printf("HashMap \t%10d \t%10d \t%10d\n", HashMapTime[0], HashMapTime[1], HashMapTime[2]);
        System.out.printf("TreeMap \t%10d \t%10d \t%10d\n", TreeMapTime[0], TreeMapTime[1], TreeMapTime[2]);


    }
}
