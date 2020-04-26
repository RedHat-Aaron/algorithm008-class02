class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //将每一个 元素转换为char数组，然后进行排序，相等就说明是同一个
        /*List<List<String>> res = new ArrayList<>();
        Map<String, Integer> temp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);
            if (!temp.containsKey(str)) {
                res.add(new ArrayList<>());
                temp.put(str, res.size() - 1);
            }
            res.get(temp.get(str)).add(strs[i]);
        }
        return res;*/

        Map<String, List<String>> temp = new HashMap<>();
        for (String str :strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!temp.containsKey(key)) temp.put(key, new ArrayList<>());
            temp.get(key).add(str);
        }
        return new ArrayList(temp.values());
    }
}