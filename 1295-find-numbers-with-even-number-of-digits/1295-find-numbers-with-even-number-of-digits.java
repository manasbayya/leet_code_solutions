class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            int temp = nums[i];
            int dc=0;
            while(temp > 0){
                temp = temp/10;
                dc++;
            }
            if(dc%2 == 0){
                count++;
            }    
        }
        return count;
        
    }
}