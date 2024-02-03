/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchvssort;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class SearchVsSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        ArrayView view = new ArrayView();
        ArrayController controller = new ArrayController(model, view);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a number in the correct format.");
                scanner.next();
            }
            array[i] = scanner.nextDouble();
        }

        model.setArray(array);

        controller.start();
    }
    }
    

