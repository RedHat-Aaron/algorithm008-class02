class Solution {
    public int[] sortedSquares(int[] A) {
        //1.循环遍历所有的元素，然后对数组进行排序（冒泡排序）
        //for(int i =0;i<A.length;i++){
        //A[i] = A[i]*A[i];
        //}
        //for(int a = 0 ; a < A.length; a++ ){
        //for(int i =0;i<A.length -1 - a;i++){
        //if(A[i] >A[i + 1] ){
        //int temp = A[i];
        //A[i] = A[i + 1];
        //A[i + 1] = temp;
        //}else{
        //continue;
        //}
        //}
        //}
        //2.插入排序
        //for(int i = 1;i<A.length;i++){
        //int value = A[i];
        //int j = i-1;
        //for(;j>=0;j--){
        //if(A[j] > value){
        //A[j + 1] = A[j];
        //}else{
        //break;
        //}
        //}
        //A[j + 1] = value;
        //}
        int N = A.length;
        int j =0;
        //首先算出有多少个负数
        while(j < N && A[j] < 0){
            j++;
        }
        int i = j -1;
        //倒序迭代负数部分，正序迭代正数部分
        int[] res = new int[N];
        int t = 0;
        while(i >= 0 && j < N){
            if(A[i] * A[i] < A[j]*A[j]){
                res[t++] = A[i]*A[i];
                i--;
            }else{
                res[t++] = A[j]*A[j];
                j++;
            }
        }
        //这里要确保若有双方有先结束的，另一方要继续
        while(i >= 0){
            res[t++] = A[i] * A[i];
            i--;
        }
        while(j < N){
            res[t++] = A[j] * A[j];
            j++;
        }
        return res;
    }
}