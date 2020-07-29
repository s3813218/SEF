package com.company;

public class Main {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        int[] iList = {70,61,72,83,38};
        int[] sorted = bs.bubbleSort(iList);
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }

    }
}
