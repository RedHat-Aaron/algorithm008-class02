class Solution {
    public int[] plusOne(int[] digits) {
       /* //对数组进行倒序循环
        for(int i =digits.length -1 ;i>=0;i-- ){
            int last = digits[i] + 1;
            if(last > 9 ){
                if(0 ==i){
                    //如果第一位大于9，那么就需要对数组进行扩容
                    int[] res = new int[digits.length+1];
                    res[0] = 1;
                    return res;
                }else{
                    digits[i] = 0;
                }
            }else{
                digits[i] = last;
                return digits;
            }
        }
        return digits;*/
        //对数组进行倒序循环
        for(int i =digits.length -1 ;i>=0;i-- ){
            digits[i]++;
            digits[i] %= 10;
            if(0 == digits[i]){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}