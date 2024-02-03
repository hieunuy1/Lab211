/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computerprogram;

import Controller.Controller;
import computerprogram.view.MenuView;

/**
 *
 * @author gabri
 */
public class ComputerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Controller controller = new Controller();
        MenuView menuView = new MenuView(controller);
        menuView.run();
    }
    
}
