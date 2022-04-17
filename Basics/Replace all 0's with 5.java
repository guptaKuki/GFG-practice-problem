class GfG {
    int convertfive(int num) {
        // Your code here
        // double numres=0,i=0,r=1;
        // while(num/10 >0){
        //     if(num%10 == 0)
        //         r=5;
        //     else
        //         r=num%10;
        //     numres=(Math.pow(10,i)*(r))+numres;
        //     i++;
        // }
        // return (int)numres;
        
        String str=""+num;
        String res=str.replaceAll("0","5");
        int number= Integer.parseInt(res);
        return number;
    }
}