class Solution {
    public int majorityElement(int[] nums) {
        /*Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums){
            if(!hashMap.containsKey(num)){
                hashMap.put(num,0);
            }else{
                hashMap.put(num,hashMap.get(num)+1);
            }
        }
        Map.Entry<Integer,Integer> res = null;
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            //可以这样搞，只要是比之前出现的次数多，那么就替换
            //if(entry.getValue()>=(nums.length/2)){
                //return entry.getKey();
            //}
            if(null == res || entry.getValue() > res.getValue()){
                res = entry;
            }
        }
        return res.getKey();*/
        /*Arrays.sort(nums);
        return nums[nums.length>>1];*/
        //摩尔排序
        int cand_num = nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == cand_num){
                count++;
            }else if(--count == 0){
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
    }
}