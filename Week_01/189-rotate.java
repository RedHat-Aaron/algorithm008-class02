class Solution {
    public void rotate(int[] nums, int k) {
        //方式一：暴力解法
        //k为几，那么所有数字往右平移几位
        //但是这个不是一次性到位的
        /*int i = 1;
        while(i<= k ){
            for(int j = 0;j<nums.length;j++){
                int temp = nums[0];
                nums[0] = nums[j];
                nums[j] = temp ;
            }
            i++;
        }*/
        //方式二：增加空间复杂度解法
        //1.先利用额外的数据调整顺序
        //2.将额外的数组赋值给原始数组
        /*int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            array[(i+k)%nums.length] = nums[i];
        }
        //然后循环将新数组赋值
        for(int j = 0; j< nums.length;j++){
            nums[j] = array[j];
        }*/
        //方式三：利用翻转数组的方式
        //翻转k次数组
        //1.先将现有数组翻转
        //2.翻转前k个元素
        //3.翻转后k个元素
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] origin, int start, int end) {
        while (start < end) {
            int temp = origin[start];
            origin[start] = origin[end];
            origin[end] = temp;
            start++;
            end--;
        }
    }
}