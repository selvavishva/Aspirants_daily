public class freqstrcount {
    public static void main(String[]args){
        char arr[] = {'a','b','d','a','b','d','s','p'};         //declare char in array
        for(int i='a';i<='z';i++){                              //run the loop check the char
           int count=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j])                      //compare the i and j
                    count++;
                
            }
            if(count>0){
                    System.out.println("occured "+count+ " times");
                }
        }
    }
}
