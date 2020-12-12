/**
 * @description: 231.2的幂
 * @author: Daniel
 * @create: 2020-12-12
 */

public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        if (n == 1 || n == 2) return true;
        while (n > 1) {
            if (n % 2 > 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }

    // 熟练使用 n&(n-1), 代码太秀了
    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
