import java.util.*;
public class Arrmovie {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("Enter the user");
        int n = can.nextInt();
        System.out.println("user");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            {
              arr[i]=can.nextInt();
            }

           int avg=0;
           int count=0;
           for(int j=0;j<arr.length;j++)
           {
            avg=avg+arr[j];
            if(arr[j]==5)
            {
                count++;
            }
           }
           double tot=(double)avg/arr.length;
           System.out.println("Average Ratting: "+tot);
            System.out.println("How many 5 stars rating:"+count);
    }
}
