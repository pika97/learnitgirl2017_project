/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract;
//creating you own exceptions 
/**
 *
 * @author swatiii
 */
class fault extends Exception{
    fault(){
        System.out.println("Exception class constructor can be used for initializations or generation of messages");
    }
   @Override public String toString(){
        return "Personalized message"; 
    }
}
public class Pract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Throwing user defined exception in the main method ");
            throw new fault();
        }
        catch(fault f){
            System.out.println("Caught thrown exception within the main method");
    }
    
}
}
/*
OUTPUT
Throwing user defined exception in the main method 
Exception class constructor can be used for initializations or generation of messages
Caught thrown exception within the main method
BUILD SUCCESSFUL (total time: 0 seconds)
*/