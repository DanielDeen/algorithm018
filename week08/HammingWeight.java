/**
 * @description: 191.位1的个数
 * @author: Daniel
 * @create: 2020-12-12
 */

public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}