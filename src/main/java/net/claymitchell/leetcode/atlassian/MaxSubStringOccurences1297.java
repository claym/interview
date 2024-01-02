package net.claymitchell.leetcode.atlassian;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxSubStringOccurences1297 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        // store how many times we find a substring
        Map<String, Integer> occurrences = new HashMap<>();
        // character count map;
        int[] countLetters = new int[26];
        int unique = 0;
        int left = 0; // head
        int right = 0; // tail
        while (right < s.length()) {
            // add characters in this window
            char r = s.charAt(right);
            // subtract 'a' char from found character to put us at a zero based index for
            // ascii code
            countLetters[r - 'a']++;
            right++;

            // see if this is a unique
            if (countLetters[r - 'a'] == 1) {
                unique++;
            }
            // see if we are in the window size
            while ((right - left) >= minSize && (right - left <= maxSize)) {
                if (unique <= maxLetters) {
                    String sub = s.substring(left, right);
                    occurrences.put(sub, occurrences.getOrDefault(sub, 0) + 1);
                }

                char l = s.charAt(left);
                countLetters[l - 'a']--;
                left++;

                if (countLetters[l - 'a'] == 0) {
                    unique--;
                }
            }
        }
        return occurrences.entrySet().stream().map(Map.Entry::getValue).max(Comparator.naturalOrder()).orElse(0);
    }
}
