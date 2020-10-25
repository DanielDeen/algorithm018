public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int area = 0;
        while (i<j) {
            int tempArea = (j -i) * Math.min(height[i], height[j]);

            if (tempArea > area) {
                area = tempArea;
            }

            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]){
                j--;
            } else {
                i++;
                j--;
            }
        }

        return area;
    }
}