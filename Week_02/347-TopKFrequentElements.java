class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //inti heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((h1, h2) -> map.get(h1) - map.get(h2));
        for (Integer key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        List<Integer> top_k = new LinkedList();
        while (!heap.isEmpty())
            top_k.add(heap.poll());
        Collections.reverse(top_k);
        int i = 0;
        int[] res = new int[top_k.size()];
        for (Integer top : top_k) {
            res[i] = top;
            i++;
        }
        return res;
    }
}