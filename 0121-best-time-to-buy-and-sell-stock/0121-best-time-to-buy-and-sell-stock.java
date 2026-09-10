class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int difference=prices[i]-prices[i-1];
            sum=sum+difference;
            sum=Math.max(0,sum);
            maxProfit=Math.max(maxProfit,sum);
        }
        return maxProfit;
    }

}