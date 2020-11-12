/**
 * @description: 柠檬水找零
 * @author: Daniel
 * @create: 2020-11-12
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fiveCoins = 0;
        int tenCoins = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCoins++;
            } else if (bill == 10) {
                fiveCoins--;
                tenCoins++;
            } else if (tenCoins > 0) {
                tenCoins--;
                fiveCoins--;
            } else {
                fiveCoins -= 3;
            }

            if (fiveCoins < 0) return false;
        }
        return true;
    }
}
