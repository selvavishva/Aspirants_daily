import java.util.Random;

class who {
    public static void main (String[] args) {
   

    Random rand = new Random();
       int num=1;

      while(num!=5){
    num = rand.nextInt(10);
    System.out.println(num);
    }
}
}