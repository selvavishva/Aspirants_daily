import java.util.Scanner;
public class ifelseprac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String RCB= scan.nextLine();

        
        if (RCB.equals("win")) {
            System.out.println("Victory");
        }
        else{
            System.out.println("lose");
        }
    }
}
