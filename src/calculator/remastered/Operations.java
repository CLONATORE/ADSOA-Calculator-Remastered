/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.remastered;

/**
 *
 * @author Andres
 */
public class Operations {
    double addtotal;
    double sustotal;
    double divtotal;
    double multotal;
    public double addition (double addA, double addB){
        addtotal+=addA+addB;  
        return (addtotal);
    }
    public double sustraction(double susA, double susB){
        sustotal+=susA-susB;
        return(sustotal);
    }
    public double division(double divA, double divB){
        divtotal+=divA/divB;
        return(divtotal);
    }
    public double multiplication(double mulA, double mulB){
        multotal+=mulA*mulB;
        return(multotal);
    }
}
