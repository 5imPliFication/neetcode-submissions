class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] str = s.toCharArray();
        int n = str.length;
        int l = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == str[n - 1 - i])
                count++;
        }
        return count == n;
    }
}