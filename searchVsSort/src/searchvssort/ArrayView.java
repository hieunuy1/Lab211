/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchvssort;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class ArrayView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayIndex(int index) {
        if (index != -1) {
            System.out.println("The number is found at index: " + index);
        } else {
            System.out.println("The number is not found in the array.");
        }
    }

    public int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public double getNumberToSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a number in the correct format.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
