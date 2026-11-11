class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int r;
        while(x > 0){
            r = x%10;
            rev = rev*10 + r;
            x = x/10;
        }
        if(org == rev){
            return true;
        }
        return false;
    }
}