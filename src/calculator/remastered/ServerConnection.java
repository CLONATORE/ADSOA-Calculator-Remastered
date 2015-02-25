/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.remastered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Andres
 */
public class ServerConnection {
    public void ConnectionExchange(){
        try{
            Socket instance = new Socket("localhost",1234);
            PrintStream out =  new PrintStream(instance.getOutputStream());
            System.out.print("Bienvenido a la calculadora ADS");
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(read);
            String stream = buffer.readLine();
            out.println(stream);
            BufferedReader buffering = new BufferedReader(new InputStreamReader(instance.getInputStream()));
            String output = buffering.readLine();
            System.out.printf(output);
        }
        catch(Exception ex){
            System.out.println("Can´t connect to server...");
            System.out.println("All calculator system will be deploy here...");
            //System.exit(-1);
        }
    } 
}
