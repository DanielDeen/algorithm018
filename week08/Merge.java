import java.util.*;
/**
 * @description: 56.合并区间
 * @author: Daniel
 * @create: 2020-12-13
 */

public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            // 这个逻辑棒棒大~~~
            int left = intervals[i][0], right = intervals[i][1];
            if (res.size() == 0 || res.get(res.size() - 1)[1] < left) {
                res.add(new int[]{left, right});
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], right);
            }
        }

        return res.toArray(new int[res.size()][]);
    }


    // 执行时间最短的方法，学习一下
    public int[][] merge2(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;

        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                // 将区间合并，前一个区间置null
                if (intervals[i][1] >= intervals[j][0] && intervals[i][0] <= intervals[j][1]) {
                    if (intervals[i][0] < intervals[j][0]) intervals[j][0] = intervals[i][0];
                    if (intervals[i][1] > intervals[j][1]) intervals[j][1] = intervals[i][1];
                    intervals[i] = null;
                    count++;
                    break;
                }
            }
        }
        int[][] ans = new int[intervals.length-count][];
        for (int i = 0,j = 0; j < intervals.length; j++) {
            if (intervals[j] != null) {
                ans[i++] = intervals[j];
            }
        }
        return ans;
    }
}

