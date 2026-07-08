class Solution {
    public int singleNumber(int[] nums) {
        int found = 0;
        for(int num : nums) {
            found = found ^ num ;
        }
        return found;
    }
}