class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
                
                int dc = 0;
                int n = nums[i];
                while(n > 0){
                    dc++;
                    n = n/10;

                }
                 if(dc%2 == 0){
                count++;
            }
           
        }
         return count;
       
    }
}