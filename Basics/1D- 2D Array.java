class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        int add=0;
        for(int i=0 ; i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j)
                    add+=a[i][j];
            }
        }
        
         int max=0;
        for( int k=0;k<n;k++){
            if(b[k]> max)
                max=b[k];
        }
        
    ArrayList<Integer> al= new ArrayList<>();
    al.add(add);
    al.add(max);
        return al;
    }
}