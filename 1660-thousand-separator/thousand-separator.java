class Solution {
    public String thousandSeparator(int n) {
       StringBuilder ans = new StringBuilder();
       int count = 0;
       while(n>0) {
        ans.append(n%10);
        n/=10;
        count++;

        if(count == 3 && n > 0) {
            ans.append(".");
            count = 0;
        }
    } 
    if(ans.length() == 0) {
        return "0";
    }
    return ans.reverse().toString();
    }
}