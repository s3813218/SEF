package com.company;

public class BubbleSort {
    public int[] bubbleSort(int[] iList){
        int n = iList.length;
        int[] newList = iList.clone();
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(newList[j] > newList[j+1]){
                    int higher = newList[j];
                    int lower = newList[j+1];
                    newList[j+1] = higher;
                    newList[j] = lower;
                }
            }
        }
        return newList;
    }
}


