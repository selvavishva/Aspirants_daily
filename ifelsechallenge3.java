import java.util.Scanner;
public class ifelsechallenge3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int Even =scan.nextInt();

        if(Even%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}
