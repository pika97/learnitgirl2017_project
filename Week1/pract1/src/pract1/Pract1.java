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
import java.util.*;
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaring various types of data types in java 
        int a = 67;
        float b = 4;
        System.out.println(b);
        double c = 4.0;
        byte d = 5;
        char e ='t';
        boolean f = true;
        long g =300000000;
        short h = 3333;
        //type conversions 
        // implicit type conversion from float to double  
        c = b;
        //explicit type conversion needed from float to int 
        b = (int)c;
        System.out.println(f);
        //Prints true & not 1 as 1 is not the same as true in java 
        a = e;
        System.out.println(a);
        //explict converision from int to char 
        e =(char)a;
        // transitioning from smaller to bigger data type requires explicit conversion 
        // transitioning from biggger to snaller data type is done implicitly 
        
        
    }
    
}
