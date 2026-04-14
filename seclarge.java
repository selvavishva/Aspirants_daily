class seclarge{
    public static void main(String [] args){
        int arr[] = {2,54,29,11};         //initalize in the array
        int firstmax=0;
        int secmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstmax){            //using for loop compare with firstmax 
              firstmax=arr[i];                 // store in that firstmax Find the max number in the array
            }
           
            if(arr[i]!=firstmax && arr[i]>secmax)       //using && operation not firstmax arr greater tham secmax
                secmax=arr[i];
        }
        //System.out.println(firstmax);
        System.out.println(secmax);               //print the output
    }
}