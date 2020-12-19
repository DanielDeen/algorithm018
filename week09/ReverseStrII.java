/**
 * @description: 541.反转字符串II
 * @author: Daniel
 * @create: 2020-12-17
 */

public class ReverseStrII {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0, len = chars.length; i < len; i += k * 2) {
            // right 值，然后进行翻转
            int left = i, right = (i + k - 1 < len) ? i + k - 1 : len - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
