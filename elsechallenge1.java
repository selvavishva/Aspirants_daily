import java.util.Scanner;
public class elsechallenge1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int mark = scan.nextInt();

        //int mark = 55;
        if (mark<50) {
            System.out.println("need to improve");
        } else if(mark>=50 && mark<=70){
            System.out.println("Good Job!");
        }
        else if (mark>70) {
            System.out.println("Excellent");
        }
    }
}
