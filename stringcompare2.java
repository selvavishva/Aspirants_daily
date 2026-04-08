import java.util.Scanner;
public class stringcomapre2 {
    public static void main(String[] args) {
        
        String a = "single";
        String b = "Married";
        
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        if (s1.equals(s2)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }
    }
}
