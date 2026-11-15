class Solution {
    public int addDigits(int n) {
        int r;
        if(n == 0){
            return 0;
        }
        else if(n%9 == 0){
            return 9;
        }
        else{
        r = n % 9;
        }

        return r;

        
    }
}