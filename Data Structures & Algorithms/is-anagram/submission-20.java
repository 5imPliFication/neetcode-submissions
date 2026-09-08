class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        for (int i = 0; i < a1.length; i++) {
            h1.put(a1[i], h1.getOrDefault(a1[i], 1) + 1);
        }
        for (int j = 0; j < a2.length; j++) {
            h2.put(a2[j], h2.getOrDefault(a2[j], 1) + 1);
        }

        return h1.equals(h2);
    }
}
