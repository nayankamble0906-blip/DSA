class Solution {
    public int findLUSlength(String a, String b) {
        int i=0;
        if(a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}