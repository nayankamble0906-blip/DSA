class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int sumA = 0, sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int diff = (sumA - sumB) / 2;

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int x : aliceSizes) {
            set.add(x);
        }
        for (int b : bobSizes) {
            int a = b + diff;

            if (set.contains(a)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
}