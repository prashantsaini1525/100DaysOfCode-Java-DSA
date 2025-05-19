//time Complexity for this code is O(n²)
//space Complexity for this code is O(1)
//this approach is using brute force to calculate left max and right max boundaries
public class TrappingRainWater {

    public static int trappedRainWater(int height[]) {
        int trappedWater = 0;
        int n = height.length;

        //this approach is using brute force to calculate left max and right max boundaries
        for (int i = 0; i < n; i++) { // i = currentbar, n = totalbars
            int leftMax = 0;
            int rightMax = 0;

            //calcualte leftmax boundary
            for (int j = i; j >= 0; j--) { // j = leftpointer, i = currentbar
                leftMax = Math.max(leftMax, height[j]);
            }

            //calculate righMax boundary
            for (int k = i; k < n; k++) { // k = rightpointer, i = currentbar
                rightMax = Math.max(rightMax, height[k]);
            }

            //calculate trapped water
            int waterLevel = Math.min(leftMax, rightMax);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainWater(height));
    }
}
