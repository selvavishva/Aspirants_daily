import java.util.Scanner;
public class nameagebasic1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
         scan.nextLine();
        String Address = scan.nextLine();
       
        System.out.println("My Name is"+name);
        System.out.println("My Age is"+age);
        System.out.println("My Address is"+Address);
      }
}
