import java.lang.System;
import java.util.Scanner;

class gif6{
    public static void main(String[] args) {
       
         Scanner gif = new Scanner(System.in);
        
        int scholar = gif.nextInt();

      //int scholar = 7000;     
        if(scholar>=7000) {
            System.out.println("Availabile");
            
        } else {
            System.out.println("not Available");
        }
    }
}