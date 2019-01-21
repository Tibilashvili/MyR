package com.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int myArray[] = {64, 3, 1, -14, 62, 11, 0, 6};
        int startIndex = 0; //
        int endIndex = myArray.length - 1; // 7;


        System.out.println(myArray[(endIndex - startIndex)/2]); // - 14
        System.out.println(myArray[startIndex + (endIndex - startIndex)/2]); // - 14 (т.е. число под индексом 3. Получили его

        // System.out.println("bubble sort: " + Arrays.toString(bubbleSort(myArray)));
      //  System.out.println("selection sort: " + Arrays.toString(selectionSort(myArray)));
        // System.out.println("merge sort: " + Arrays.toString(mergeSort(myArray)));
     //   System.out.println("quick sort: " + Arrays.toString(quickSort(myArray), startIndex, endIndex));

    }


    public static int[] bubbleSort(int[] myArray) {


        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = 0;
                if (myArray[j] > myArray[j + 1]) {
                    temp = myArray[j + 1];
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                }
            }


        }
        return myArray;

    }

    public static int[] selectionSort(int[] myArray) {


        for (int i = 0; i < myArray.length - 1; i++) { // - 1 потому, что если в массиве остался 1 элемент, то нам его не с чем срвнить, значит он отсортирован (нет необходимости делать еще одну итерацию)_

            int min = i; // индекс минимального элемента (будем считать, что i с индексом 0 - минимальный элемент)

            for (int j = i; j < myArray.length; j++) { // начинать будем не от 0, а от текущего индекса i, чтобы не проверять отсортированную часть массива

                if (myArray[j] < myArray[min]) {
                    min = j; // нашли индекс минимального элемента
                }

            }

            int temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;


        }

        return myArray;

    }


    public static int[] mergeSortFirstPart(int[] myArray, int lowIndex, int highIndex) {

        if (myArray.length < 2){
            return myArray;
        }

        int[] leftArray = new int [myArray.length / 2];
        int[] rightArray = new int [myArray.length - leftArray.length];








        return myArray;
    }

    public static int[] mergeSortSecondPart(int[] myArray, int lowIndex, int highIndex) {

        return myArray;
    }
    

   /* public static int[] quickSort(int[] myArray, int startIndex, int endIndex) {









        return myArray;


    } */

    public static void quickSort(int[] myArray, int startIndex, int endIndex){

        if (myArray.length == 0){
            return;
        }

        int pivot = myArray[(endIndex - startIndex) / 2];


        int i = startIndex;
        int j = endIndex;

        while (i <= j) {


            while (myArray[i] < pivot) {
                i++;

            }

            while (myArray[j] > pivot) {
                j--;
            }

            if (myArray[i] > myArray[j]) {
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }

        }

       // quickSort(myArray, startIndex, endIndex);






        return myArray;
    }
}








