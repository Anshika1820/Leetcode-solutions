class Solution {
    public int maxProfit(int[] prices) {
        int sellStock=0;
        int buyStock=prices[0];
        for(int i=1;i<prices.length;i++){
            int currentProfit=prices[i]-buyStock;
            if(currentProfit>sellStock){
                sellStock=currentProfit;
            }
            if(prices[i]<buyStock){
                buyStock=prices[i];
            }
        }
        return sellStock;
    }
}