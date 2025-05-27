package src.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String text = "abcabcbb";
        System.out.println(findLongestSubstring(text));
    }

    static int findLongestSubstring(String text) {
        int max = 0;
        for (int i = 0; i <= text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (checkForDuplicate(text.substring(i, j))) {
                    max=Math.max(max,  text.substring(i, j).length());
                }
            }
        }
        return max;
    }

    static boolean checkForDuplicate(String str){
        Set<Character> seenCharacters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seenCharacters.contains(c)) {
                return false;
            }
            seenCharacters.add(c);
        }
        return true;

}
}
