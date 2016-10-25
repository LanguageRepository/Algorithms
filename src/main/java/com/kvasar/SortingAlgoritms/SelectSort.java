package com.kvasar.SortingAlgoritms;

import java.util.Arrays;

/**
 * Created by kvasa on 25.10.2016.
 */
public class SelectSort extends AbstractSorting{

    public SelectSort(int capacity) {
        this.capacity = capacity;
        this.array = fillArray(capacity);
        sortArray();
    }

    public SelectSort() {
        this.array = fillArray(DEFAULT_SIZE);
    }

    void sortArray() {
        int temp, j;
        for(int i = 0; i < array.length; i++) {
            temp = array[i];
            for(j = i-1; j >= 0 && array[j] > temp; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
