/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author swatiii
 */
interface random { //basically a structure, the class which implemets the interface has to define the methods 
    int a =5; 
    void show();
}
class A implements random{
    A(){
        System.out.println("The variable inside the interface random is basically a constant hence it can be accessed here, a= "+a);
    } 
    public void show(){ //must be public otherwise it'll show an error 
        System.out.println("Inside method definition of interface random, implemented by class A ");
        
    }
}
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();//creating an object of class A 
        a.show();
    }
    
}
/*
OUTPUT
The variable inside the interface random is basically a constant hence it can be accessed here, a= 5
Inside method definition of interface random, implemented by class A 
BUILD SUCCESSFUL (total time: 0 seconds)
*/