class Solution {
    public void moveZeroes(int[] nums) {
        int j =0;
      for(int i =0 ; i< nums.length;i++){
          if(0 != nums[i]){
              nums[j++] = nums[i];
          }
      }
      for(int i =j;i<nums.length;i++){
          nums[i] = 0;
      }
    }
}