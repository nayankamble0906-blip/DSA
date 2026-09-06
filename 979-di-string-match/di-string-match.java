class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];

        int low = 0;
        int high = n;
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'I') {
                ans[index++] = low++;
            } else {
                ans[index++] = high--;
            }
        }
        ans[index] = low;

        return ans;
    }
}