/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.remastered;

import javax.swing.SwingUtilities;

/**
 *
 * @author Andres
 */
public class Consistency {
        int contkill;
    public void preservation(){
        Creating cells = new Creating();
        System.out.println("ADSOA Calculator started");
        cells.cratingsus();
        cells.creatingadd();
        cells.creatingdiv();
        cells.creatingmul();
    }
    public void preservsus(){
        contkill+=1;
        if(contkill<=1){
            System.out.println("A sustraction cell has been killed");
            System.out.println("System affected");
            System.out.println("The system will create a new cell");
            SwingUtilities.invokeLater(() -> {
                Sustraction sus = new Sustraction();
                sus.setVisible(true);
            });
        }
    }
    public void preservmul(){
        contkill+=1;
        if(contkill<=1){
            System.out.println("A multiplicstion cell has been killed");
            System.out.println("System affected");
            System.out.println("The system will create a new cell");
            SwingUtilities.invokeLater(() -> {
                Multiplication mul = new Multiplication();
                mul.setVisible(true);
            });
        }
    }
    public void preservediv(){
        contkill+=1;
        if(contkill<=1){
            System.out.println("A division cell has been killed");
            System.out.println("System affected");
            System.out.println("The system will create a new cell");
            SwingUtilities.invokeLater(() -> {
                Division div = new Division();
                div.setVisible(true);
            });
        }
    }
    public void preservadd(){
        contkill+=1;
        if(contkill<=1){
            System.out.println("A addition cell has been killed");
            System.out.println("System affected");
            System.out.println("The system will create a new cell");
            SwingUtilities.invokeLater(() -> {
                Addition add = new Addition();
                add.setVisible(true);
            });
        }
    }
}
