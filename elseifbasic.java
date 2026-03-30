import java.util.Scanner;
public class elseifbasic {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if(mark>35 && mark<59){
            System.out.println("Video game");
        }
        else if(mark>60 && mark<89){
             System.out.println("Iphone");
        }
        else if(mark>90 && mark<100){
            System.out.println("Macbook");
        }
        else{
            System.out.println("fail");
        }
    }    
}