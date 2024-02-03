/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computerprogram.view;

/**
 *
 * @author gabri
 */
import Controller.Controller;

public class MenuView extends Menu {
    public MenuView(Controller controller) {
        super(controller);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("0. Exit");

            int option = controller.checkInputIntLimit(0, 2);

            switch (option) {
                case 1 -> {
                    System.out.println("===== Normal Calculator =====");
                    controller.normalCalculator();
                }
                case 2 -> {
                    System.out.println("===== BMI Calculator =====");
                    controller.BMICalculator();
                }
                case 0 -> {
                    System.out.println("Exiting the program...");
                    return;
                }
            }

            System.out.println(); 
        }
    }
}