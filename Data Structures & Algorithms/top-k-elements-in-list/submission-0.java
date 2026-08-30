class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        values = values.subList(values.size()-k, values.size());

        int j=0;
        for (Map.Entry m: map.entrySet()) {
            if (values.isEmpty())
                break;
            if (values.contains(m.getValue())) {
                res[j++] = (int) m.getKey();
                values.remove(m.getValue());
            }
        }
        return res;
    }
}
