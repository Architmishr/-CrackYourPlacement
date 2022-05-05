class Solution {
    public int maxProfit(int[] prices) {
        int lp = prices[0];       //least price
        int op = 0;               //overall profit
        int pist = 0;             // profit if sold today
        for(int i=0; i<prices.length; i++){
            if(lp > prices[i] )   // if we found new buy value which is more smaller then previous 
                lp = prices[i];   // update our least price
            pist = prices[i] - lp;// calculating profit if sold today by, Buy - sell
            if(pist > op)         // if pist is more then our previous overall profit
                op = pist;        // update overall profit
        }
        return op;
    }
}
