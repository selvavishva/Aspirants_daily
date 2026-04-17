import java.util.Scanner;
public class ifelsechallenge1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int ship = scan.nextInt();

        if (ship>7000) {
            System.out.println("Available");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}
