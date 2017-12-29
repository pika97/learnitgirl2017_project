/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract1;

/**
 *
 * @author swatiii
 */
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int zero = 0;
            int num = 5495;
            System.out.println("Division by zero throws an exception "+ num/zero);
        }
        catch(ArithmeticException exp){
            System.out.println("Thrown exception is "+exp);
        }
    }
    
}
/*
OUTPUT 
Thrown exception is java.lang.ArithmeticException: / by zero
BUILD SUCCESSFUL (total time: 0 seconds)
*/