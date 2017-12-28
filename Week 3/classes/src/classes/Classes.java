/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author swatiii
 */
//Basics of classes 
class A{
    int a = 1;
    A(){
        System.out.println("A's constructor called");
    }
    void show(){
        System.out.println("Show function in A, variable a =  "+a);
    }
}

class B{
    int b =2;
    B(){
        System.out.println("B's constructor called ");
    }
    void show(){
        System.out.println("Show function in B, variabl b =  "+b);
    }
    
}
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating objects of the two classes declared above 
        A a = new A(); //immediately calls the constructor of class A 
        B b = new B();//immediately calls the constructor of class B
        a.show(); //calls th show function inside class A 
        b.show(); //calls th show function inside class B 
    }
    
}
/*
OUTPUT 
A's constructor called
B's constructor called 
Show function in A, variable a =  1
Show function in B, variabl b =  2
BUILD SUCCESSFUL (total time: 0 seconds)
*/