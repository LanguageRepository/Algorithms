package com.kvasar.SortingAlgoritms;

/**
 * Created by kvasa on 25.10.2016.
 */
abstract class AbstractSorting {

    int[] array;
    final static int DEFAULT_SIZE = 10;
    int capacity;

    int[] fillArray(int capacity) {
        this.array = new int[capacity];
        for(int i = array.length-1; i > 0; i--) {
            array[i] = (int)(Math.round(Math.random()*100));
        }
        return array;
    }

    abstract void sortArray();

}
