import java.util.*;
public class leapyr {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int yr = scan.nextInt();

        if(yr%4==0 && yr%100!=0 || yr%400==0)    System.out.print("Leap year");
        else     System.out.print("not leap year");
    }
}
