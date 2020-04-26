class Solution {
    public int nthUglyNumber(int n) {
        /**
         思路：丑数 = 某较小丑数 *  某个因子，为什么选较小的丑数呢？是因为题目要求第n个，所以必须连续
         */

        int[] dp = new int[n];
        //第一个丑数是1
        dp[0] = 1;
        //创建三个下标，分别用来标识三个因子，然后在得出的数中选择最小的，因为最小的就是最靠近前一个丑数的
        int a = 0,b = 0,c = 0;
        for(int i = 1;i< n;i++){
            dp[i] = Math.min(Math.min(dp[a]*2,dp[b]*3),dp[c]*5);
            if(dp[i] == dp[a] * 2 )  a++;
            if(dp[i] == dp[b] * 3 )  b++;
            if(dp[i] == dp[c] * 5 )  c++;
        }
        return  dp[n-1];
    }
}