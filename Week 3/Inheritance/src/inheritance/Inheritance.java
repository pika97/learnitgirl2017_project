/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author swatiii
 */
class A {
    int a =1;
    A(int a){
        System.out.println("A's contructor with an integer parameter = "+a);
    }
}
class B extends A{
    B(int c,int d){
        super(c);
        System.out.println("B's constructor is called, the two parameters passes here are  "+c+ " and "+d );
    }

}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = input.nextInt();
        System.out.println("Enter the second number");
        int y = input.nextInt();
        //create an objct of class B which will automatically call the constructor of class A 
        B b = new B(x,y);
    }
    
}
/*
OUTPUT 
Enter the first number
5
Enter the second number
7
A's contructor with an integer parameter = 5
B's constructor is called, the two parameters passes here are  5 and 7
BUILD SUCCESSFUL (total time: 4 seconds)

*/