class TestClass
{
   
    private int a;
    private int b;
    TestClass(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    public void findMin(){
        int min=Math.min((a+b),(a-b));
       
        int min1=Math.min(min,(a*b));
        try{
            int divide=a/b;
            System.out.println(Math.min(min1,divide));
        }catch( Exception e){
             System.out.println(min1);
        }
    }
    
}