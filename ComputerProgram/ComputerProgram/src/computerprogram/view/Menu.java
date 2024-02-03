/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computerprogram.view;

import Controller.Controller;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public abstract class Menu {
    protected final Controller controller;
    protected final Scanner scanner;

    public Menu(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public abstract void run();
}
