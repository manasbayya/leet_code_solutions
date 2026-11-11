class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            if(i % 2 == 0){
                res[i] = nums[i/2];
            }
            else{
                res[i] = nums[(i/2) +n];
            }
        }
        return res;
        
        
    }
}
/*optimize
int[] res = new int[2*n];
        for(int i =0; i < n; i++){
            res[i*2] = nums[i];
            res[i*2+1] = nums[i+n];
        }
        return res;*/