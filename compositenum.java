import java.util.*;
public class compositenum {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =scan.nextInt();
         
       
        for(int i=2;i<n;i++){
         
            if (n%i==0){
                System.out.println("composite"); 
                return; 
            }
           
        }
         System.out.print("not composite");
    }
}
