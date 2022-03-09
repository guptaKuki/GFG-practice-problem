class Solution
{
    public double[]  FindRoots(int a, int b, int c)
    {
        // code here
        
        double discriminant = (b * b) - (4 * a * c);
        double r1= (-b - Math.sqrt(discriminant)) / (2 * a);
         double r2=  (-b + Math.sqrt(discriminant)) / (2 * a);
       
        if( discriminant < 0){
            r1=-1;
            double arr[]={r1};
            return arr;
        }
        
        if( r1 > r2){
         double arr[]= {r2,r1};
          return arr;
        }
        return  new double[]{r1,r2};
    }
}