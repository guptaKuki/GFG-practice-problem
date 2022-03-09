class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length() != S2.length()){
            return 0;
        }
        
        int arr[]= new int[26];
        int array[]= new int[26];
        
        for( int i=0;i<S1.length();i++){
            int ascii=(int)S1.charAt(i);
            arr[ascii-97]++;
        }
        for( int j=0;j<S2.length();j++){
            int ascii=(int)S2.charAt(j);
            array[ascii-97]++;
        }
        
        int check=0;
        for(int k=0,l=0;k<arr.length && l<array.length;k++,l++){
            if(arr[k] == array[l])
                check=1;
            else{
                check=0;
            break;
            }
        }
        return check;
    }
}