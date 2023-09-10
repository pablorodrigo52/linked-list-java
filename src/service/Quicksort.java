package service;

import domain.Node;

public class Quicksort {

    public static void quicksort(LinkedList linkedList, int begin, int end) {
        if (begin <= end) {
            int index = partition(linkedList, begin, end);

            quicksort(linkedList, begin, index-1);
            quicksort(linkedList, index+1, end);
        }
    }

    private static int partition(LinkedList linkedList, int begin, int end) {
        // search for pivot eg. linkedList[end];
        // we can control the partition using two controllers on our linkedlist
        // eg. i and j.. i starts on begin-1 and j starts on begin
        // looping j until end and comparing if linkedList[j].getValue().compareTo(pivot.getValue()) <= 0
        // case true, we increment i and change the value of linkedList[i] with linkedList[j]
        // in the end, we increment i and change the value of linkedList[i] with pivot
        return 0;
    }
}
