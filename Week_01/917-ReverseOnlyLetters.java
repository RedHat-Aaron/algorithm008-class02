class Solution {
    public static String reverseOnlyLetters(String S) {
        //1.暴力解法
        //循环判断当前字母是否的ASCII码是否在33-122之间
        //若在这之间，那么转换位置
        char[] chars = S.toCharArray();
        int j = chars.length-1;
        for(int i=0;i<j;i++){
            boolean flag = false;
            while(!judgeArea(chars[i])){
                flag = true;
                break;
            }
            if(flag){
                continue;
            }
            if(chars[i] == chars[j]){
                j--;
                continue;
            }
            while(!judgeArea(chars[j])){
                j--;
            }
            if(chars[i] == chars[j]){
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            j--;
        }
        return new String(chars);
        //2.简洁写法
        //StringBuilder sb = new StringBuilder();
        //int j = S.length() - 1;
        //for (int i = 0; i < S.length(); i++) {
        //if(Character.isLetter(S.charAt(i))){
        //如果是字母，那么判断j的位置上是否为字母
        //while(!Character.isLetter(S.charAt(j))){
        //j--;
        //}
        //sb.append(S.charAt(j--));
        //}else{
        //sb.append(S.charAt(i));
        //}
        //}
        //return sb.toString();
        //3.测试写法
        /*char[] chs = S.toCharArray();
        int l = 0;
        int r = chs.length - 1;
        while (l < r) {
            if (!judgeArea(chs[l])) {
                l++;
                continue;
            }
            if (!judgeArea(chs[r])) {
                r--;
                continue;
            }
            char t = chs[l];
            chs[l] = chs[r];
            chs[r] = t;
            l++;
            r--;
        }
        return String.valueOf(chs);*/
    }
    private static boolean judgeArea(char c){
        return (65<=c && c<=90)||(97<=c && c<=122);
    }
}