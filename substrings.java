public class substrings {
    public static void main(String []args){
        String s = "Hello Everyone";
        int wcount = 0;
        String s1[] = s.split(" ");
        for(int i=0;i<s.length();i++){
           wcount ++;
        }
      System.out.print(wcount);
    } 
}
