public class Arrdupli {
    public static void main(String [] args)
    {
        int[] arr={10,29,11,26,11,24};
        
        for(int i=0;i<arr.length;i++)
        {
        //for(int j=0;j<i;j++)  
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j]){
                System.out.println("This is duplicate element: "+arr[i]);
                break;
            }
        }
          
        }
    }
}
