/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_4;

import java.util.Random;

/**
 *
 * @author NikitaPC
 */
public class Lab_4 {

    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("До сортировки");
        show(arr);
        System.out.println("После сортировки");
        tailQuickSort(arr, 0, arr.length - 1);
        show(arr);
        if (isOrdered(arr)) {
            System.out.println("Массив упорядочен");
        } else {
            System.out.println("Массив не упорялдочен");
        }
    }

    public static int partition(int arr[], int left, int right) {
        int pivot = new Random().nextInt(right - left + 1) + left;
        int i = left, j = right;
        while (i < j) {
            while (i < pivot && arr[i] <= arr[pivot]) i++;
            while (j > pivot && arr[j] >= arr[pivot]) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == pivot) {
                    pivot = j;
                } else if (j == pivot) {
                    pivot = i;
                }
            }
        }
        return pivot;
    }

    public static void tailQuickSort(int arr[], int left, int right) {
        while (left < right) {
            int pivot = partition(arr, left, right);
            tailQuickSort(arr, left, pivot - 1);
            left = pivot + 1;
        }
    }

    private static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static boolean isOrdered(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
