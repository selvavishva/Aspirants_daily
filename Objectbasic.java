public class Objectbasic {
    
    String name ="";
    String processor ="";
    int ram=0;
    int price =0;

    public static void main(String[] args) {
         Objectbasic lap1 = new Objectbasic();
         Objectbasic lap2 = new Objectbasic();
         Objectbasic lap3 = new Objectbasic();
        
        lap1.name="dell";
        lap1.processor="12 Gen";
        lap1.ram=4;
        lap1.price=40000;
     System.out.println(lap1.name);

        lap2.name="bell";
        lap2.processor="13 Gen";
        lap2.ram=6;
        lap2.price=50000;
     System.out.println(lap2.processor);

        lap3.name="bell";
        lap3.processor="14 Gen";
        lap3.ram=8;
        lap3.price=60000;
     System.out.println(lap1.price);
    
    }
}

