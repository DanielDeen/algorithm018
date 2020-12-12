/**
 * @description: 190.颠倒二进制位
 * @author: Daniel
 * @create: 2020-12-12
 */

public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            if ((n & 1) == 1) {
                res++;
            }
            n >>= 1;
        }
        return res;
    }
}
