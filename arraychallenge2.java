import java.util.Scanner;
public class arraychallenge2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=num;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
