/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchvssort;

import java.util.Arrays;

public class Model {
    private double[] array;

    public void setArray(double[] array) {
        this.array = array;
    }

    public double[] getArray() {
        return array;
    }

    public void sortArray() {
        // Sử dụng Bubble Sort để sắp xếp mảng
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    double temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
