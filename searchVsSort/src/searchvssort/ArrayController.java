/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchvssort;

/**
 *
 * @author Windows
 */
public class ArrayController {
    private Model model;
    private ArrayView view;

    public ArrayController(Model model, ArrayView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        double[] array = model.getArray();

        int choice = view.getMenuChoice();

        if (choice == 2) {
            model.sortArray();
        }

        double numberToSearch = view.getNumberToSearch();

        int index = -1;
        switch (choice) {
            case 1:
                index = linearSearch(array, numberToSearch);
                break;
            case 2:
                index = binarySearch(array, numberToSearch);
                break;
            default:
                view.displayMessage("Invalid choice.");
                break;
        }

        view.displayIndex(index);
    }

    private int linearSearch(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private int binarySearch(double[] array, double key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}