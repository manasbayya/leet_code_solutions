class Solution {
    public int smallestEvenMultiple(int n) {
        int i = 0;
         int x = n*i;
        for(i = 1; i <= 2; i++){
           
            if(n*i %2 == 0){
                return n*i;
            }
        } 
        return x;
        
    }
}