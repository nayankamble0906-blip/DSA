class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> result = new ArrayList<>();
       for(int num = left; num <= right; num++) {
        int temp = num;
        boolean selfDividing = true;

        while(temp > 0) {
            int digit = temp % 10;
            
            if(digit == 0 || num % digit != 0) {
                selfDividing = false;
                break;
            }
            temp = temp / 10;
        }
        if(selfDividing) {
            result.add(num);
        }
    }
       return result;
    }
}