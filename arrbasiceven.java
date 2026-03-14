import java.util.Scanner;
public class arrbasiceven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter"+n+"elements");
        //input loop
        for(int i=0;i<n;i++)
        {
              arr[i] = scan.nextInt();
        }
            for(int j=0;j<n;j++)
            {
              if(arr[j]%2==0)
            {
                System.out.println("Even number: "+arr[j]);
            }
            else{
                System.out.println("Odd number: "+arr[j]);
            }
        }
        }
    }

