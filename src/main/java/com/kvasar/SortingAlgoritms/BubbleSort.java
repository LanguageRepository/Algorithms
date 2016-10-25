package com.kvasar.SortingAlgoritms;

import java.util.Arrays;

/**
 * Created by kvasa on 25.10.2016.
 */
public class BubbleSort extends AbstractSorting{

    public BubbleSort(int capacity) {
        this.capacity = capacity;
        this.array = fillArray(capacity);
        sortArray();
    }

    public BubbleSort() {
        this.array = new int[DEFAULT_SIZE];
    }

    void sortArray() {
        for(int i = array.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
