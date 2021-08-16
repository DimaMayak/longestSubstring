import java.util.HashSet;

public class Solution {
    //Given a string s, find the length of the longest substring without repeating characters.
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int k = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.add(s.charAt(i))) {
                j++;
            } else {
                if (j > k) k = j;
                j = 1;
                set.clear();
                set.add(s.charAt(i));
            }

        }
        return k;
    }
}
