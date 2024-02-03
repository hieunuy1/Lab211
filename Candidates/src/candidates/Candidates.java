/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candidates;

import java.util.ArrayList;

/**
 *
 * @author Lul
 */
public class Candidates {

    /**
     * @param args the command line arguments
     */
  
       

    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
    
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1 -> Manager.createCandidate(candidates, 0);
                case 2 -> Manager.createCandidate(candidates, 1);
                case 3 -> Manager.createCandidate(candidates, 2);
                case 4 -> Manager.searchCandidate(candidates);
                case 5 -> {
                    return;
                }
            }
        }
    
    }
    
        }
