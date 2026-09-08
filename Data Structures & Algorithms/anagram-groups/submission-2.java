class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26]; // [0,0,0,0,...]
            for (char c : str.toCharArray()) {
                count[c - 'a']++; // act: [1,0,1,...1,0,0,0,0]
            }
            // Use the array content as the key
            String key = Arrays.toString(count);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
