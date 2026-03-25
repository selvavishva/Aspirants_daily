import java.util.Scanner;
public class biodataprac {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine();
        Double mark = scan.nextDouble();
        scan.nextLine();
        String dept = scan.nextLine();

        System.out.println("my name is: "+name);
        System.out.println("my mark is: "+mark/10"/10");
        System.out.println("my department is: "+dept);
    }
}
