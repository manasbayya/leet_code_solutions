class Solution {
    public int maximumWealth(int[][] acc) {
        int n = acc[0].length-1;
        int maxwealth = 0;
    
        for(int i = 0; i < acc.length ; i++){
            int currentcus = 0;
        for(int j = 0; j < acc[i].length; j++){
            currentcus += acc[i][j];     
        }
        
        if(currentcus > maxwealth){
            maxwealth = currentcus;
        }
        }
        return maxwealth;
    }
}