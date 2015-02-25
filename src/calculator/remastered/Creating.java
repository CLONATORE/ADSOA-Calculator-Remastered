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
public class Creating {
        public void creatingadd(){
        SwingUtilities.invokeLater(() -> {
            Addition add = new Addition();
            add.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Addition add = new Addition();
            add.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Addition add = new Addition();
            add.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Addition add = new Addition();
            add.setVisible(true);
        });
        System.out.println("Four addition cells were created");
    }
    public void cratingsus(){
        SwingUtilities.invokeLater(() -> {
            Sustraction sus = new Sustraction();
            sus.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Sustraction sus = new Sustraction();
            sus.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Sustraction sus = new Sustraction();
            sus.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Sustraction sus = new Sustraction();
            sus.setVisible(true);
        });
        System.out.println("Four sustraction cells were created");
    }
    public void creatingmul(){
        SwingUtilities.invokeLater(() -> {
            Multiplication mul = new Multiplication();
            mul.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Multiplication mul = new Multiplication();
            mul.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Multiplication mul = new Multiplication();
            mul.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Multiplication mul = new Multiplication();
            mul.setVisible(true);
        });
        System.out.println("Four multiplication cells were created");
    }
    public void creatingdiv(){
        SwingUtilities.invokeLater(() -> {
            Division div = new Division();
            div.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Division div = new Division();
            div.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Division div = new Division();
            div.setVisible(true);
        });
        SwingUtilities.invokeLater(() -> {
            Division div = new Division();
            div.setVisible(true);
        }); 
        System.out.println("Four division cells were created");
    }
}
