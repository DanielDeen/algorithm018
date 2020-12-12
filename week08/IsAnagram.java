import java.util.Arrays;

/**
 * @description: 242.有效的字母异位词
 * @author: Daniel
 * @create: 2020-12-12
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArrays = s.toCharArray();
        char[] tArrays = t.toCharArray();
        Arrays.sort(sArrays);
        Arrays.sort(tArrays);
        return String.valueOf(sArrays).equals(String.valueOf(tArrays));
    }

    // 这种解法，自己个儿感觉挺不错的，学习学习
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] temp = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            temp[sChar - 'a']++;
            temp[tChar - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
