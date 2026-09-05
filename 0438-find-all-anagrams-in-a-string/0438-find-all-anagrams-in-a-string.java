class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] countP=new int[26];
        int[] countWindow=new int[26];
        if (p.length() > s.length()) {
            return result;
            }

        for(int i=0;i<p.length();i++){
            countP[p.charAt(i)-'a']++;
            countWindow[s.charAt(i)-'a']++;
        }
        for (int right = p.length(); right < s.length(); right++){
            if(Arrays.equals(countP,countWindow)){
                result.add(right-p.length());
            }
            countWindow[s.charAt(right)-'a']++;
            countWindow[s.charAt(right - p.length()) - 'a']--;
        }
         if (Arrays.equals(countP, countWindow)) {
            result.add(s.length() - p.length());
        }
        return result;
    }
}