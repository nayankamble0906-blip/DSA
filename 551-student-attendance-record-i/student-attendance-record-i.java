class Solution {
    public boolean checkRecord(String s) {
        int counta = 0;
        int countl = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'A') {
                counta++;
            }
            
            if(s.charAt(i) == 'L') {
                countl++;
            }
            else {
                countl = 0;
            }
        
        if(counta >= 2 || countl >= 3) {
            return false;
        }
    }

        return true;
    }
}