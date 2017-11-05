
package pract_2;

import java.util.*;
public class Pract_2 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,c;
        System.out.println("Pick a number between 1 to 10");
         n = input.nextInt();
         if(n>=5 && n<=10)
             c=2;
         else if(n<5 && n>0) 
             c=1;
         else 
             c=0;
         switch(c){
             case 1: System.out.println("Valid & less than 5 ");break;
             case 2:System.out.println("Valid and more than/ equal to 5");break;
             default: System.out.println("Invalid");break;
         }
    }
    
}
