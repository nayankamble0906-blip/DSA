class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }
        String[] words = text.trim().split("\\s+");

        if (words.length == 1) {
            return words[0] + " ".repeat(spaces);
        }

        int between = spaces / (words.length - 1);

        int extra = spaces % (words.length - 1);

        String gap = " ".repeat(between);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if (i < words.length - 1) {
                result.append(gap);
            }
        }
        result.append(" ".repeat(extra));

        return result.toString();
    }
}