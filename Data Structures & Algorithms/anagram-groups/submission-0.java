class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sCh = String.valueOf(ch);
            if (!map.containsKey(sCh))
                map.put(sCh, new ArrayList<String>());
            map.get(sCh).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
