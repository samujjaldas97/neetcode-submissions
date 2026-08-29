class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCh = s.toCharArray();
        Arrays.sort(sCh);
        char[] tCh = t.toCharArray();
        Arrays.sort(tCh);

        return String.valueOf(sCh).equals(String.valueOf(tCh));
    }
}
