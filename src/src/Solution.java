import java.util.HashSet;
import java.util.Set;

public class Solution {
    //Given a string s, find the length of the longest substring without repeating characters.
    public static int lengthOfLongestSubstring(String s) {
        int k=0;
        int j=0;
        int length=0;

        HashSet<Character> set = new HashSet<>();
        while (j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                length=Math.max(set.size(), length);
            }
            else{
                set.remove(s.charAt(k));
                k++;
            }
        }
        return length;
    }
}
