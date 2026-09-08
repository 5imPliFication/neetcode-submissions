class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
    
        for (String str : strs) {
            int l = str.length();
            sb.append(l).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> rs = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int split = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, split));
            
            int start = split + 1;
            int end = start + length;

            rs.add(str.substring(start, end));
            i = end;
        }

        return rs;
    }
}
