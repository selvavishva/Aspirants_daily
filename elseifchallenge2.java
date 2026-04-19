import java.util.Scanner;
public class elseifchallenge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mark1 = scan.nextInt();
          int mark2 = scan.nextInt();
          int mark3 = scan.nextInt();
          int mark4 = scan.nextInt();
          int mark5 = scan.nextInt();
        
          int avg = mark1+mark2+mark3+mark4+mark5;
          int tot =avg/5;
         if (tot<35) {
            System.out.println("Extra class needed");
         }
         else{
            System.out.println("you are much better");
         }
    }
}
