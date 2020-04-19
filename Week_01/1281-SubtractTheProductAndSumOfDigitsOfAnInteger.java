class Solution {
    public static int subtractProductAndSum(int n) {
        //循环取出每位数字
        //声明两个变量，分别用来存储加乘结果
        int sum = 0;
        int mutiply = 1;
        while(n > 0){
            sum += n%10;
            mutiply *= n%10;
            n = n/10;
        }
        return (mutiply - sum);
    }
}