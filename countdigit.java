class countdigit {
    public int countDigits(int num) {
        int ori=num;
        int count=0;
        while(num>0)
        {
         int d=num%10;
        if(d!=0&&ori%d==0){
             count++;
        }
          num/=10;
        }
       return count;
        }

}