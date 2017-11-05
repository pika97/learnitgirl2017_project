
package pract_1;


public class Pract_1 {

    
    public static void main(String[] args) {
        int a[]= {1,2,3};
        //throws out of bound exception
       /* a[3] =4;
        for(int i=0;i<4;i++)
             System.out.println(a[i]+" ");*/
        int s[] = new int [4];
        s[3] = 4;
        //doesn't throw an exception
        for(int i=0;i<4;i++)
            System.out.println(s[i]+" ");
        
        
    }
    
}
