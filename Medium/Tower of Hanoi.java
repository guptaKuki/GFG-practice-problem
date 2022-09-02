class Hanoi {

    public long toh(int n, int from, int to, int aux) {
        // Your code here
        if(n == 1){
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            return 1;
        }
        
        long m1=toh(n-1,from,aux,to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        long m2=toh(n-1,aux,to,from);
        return 1+m1+m2;
    }
}