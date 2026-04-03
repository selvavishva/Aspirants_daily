public class freqcount {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1,4,5,4,5,9};    //declare element in array

         int max=arr[0];                       //take a first inder of a array

         for(int i=0;i<arr.length;i++){          
            if(arr[i]>max)                      //find the max element in array
            max=arr[i];

        }
        System.out.println(max);              //9

        for(int j=0;j<max;j++){             //outer loop
            int count =0;
            for(int k=0;k<arr.length;k++)         //we find the max element compare with j and k count the element
            {
                if(j==arr[k]){
                    count++;
            }
        }
        if(count>0)
            System.out.println(j+" occured " +count+ " times ");   //print the value
    }
}
}
