class testClass implements in1
{
    public void display(int k)
    {   
        // Add your code here.
        if( k == 1 || k == 0)
            return;
            
        int count=0;
        int flag=1;
        for(int i=2;i<=k;i++){
           for(int j=2;j<=i/2;j++){
               if(i % j == 0){
                   flag=0;
                  break;
                }else                   
                    flag=1;
           }
           if(flag == 1)
                 count++;
        }
        System.out.println(count);
    }
}