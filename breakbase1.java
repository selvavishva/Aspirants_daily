public class breakbase1 {
  public static void main(String[] args) {
      boolean match=false;
      for(int i=1;i<10;i++){
        for(int j=1;j<10;j++){
            if(i==2 && j==2){
                match=true;
             break;
            }
                

        }
        if(match==true){
            break;
        }
      }
      System.out.println(match);
  }
}
