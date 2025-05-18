//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
//this approach is using 2 pointers to store left max and right max boundaries
// Approach: Two Pointer Approach
// This approach is more space efficient than the previous one

public class TrappingRainWater {

    public static int trappedRainWater(int height[]) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        //two pointer approach
        while(leftPointer <= rightPointer) {
            //compare left and right max boundaries
            if(height[leftPointer] <= height[rightPointer]) {
                //if left max is less than or equal to left pointer
                if(height[leftPointer] >= leftMax) {
                    //update left max
                    leftMax = height[leftPointer];
                } else {
                    //calculate trapped water
                    trappedWater += leftMax - height[leftPointer];
                }
                leftPointer++;
            } else {
                //if right max is less than or equal to right pointer
                if(height[rightPointer] >= rightMax) {
                    //update right max
                    rightMax = height[rightPointer];
                } else {
                    //calculate trapped water
                    trappedWater += rightMax - height[rightPointer];
                }
                rightPointer--;
            }
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainWater(height));
    }
}
