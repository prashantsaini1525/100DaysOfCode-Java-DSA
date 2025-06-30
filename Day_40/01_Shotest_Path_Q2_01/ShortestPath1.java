// Time Complexity: O(n) || Space Complexity: O(1)
// Problem: Given a string representing a path with directions (N, S, E, W),
// calculate the shortest distance from the starting point (0, 0) to the final position.

public class ShortestPath1 {

    public static float findShortestPath(String path) {
        int x = 0, y = 0;

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        // After processing all directions, x and y represent the net displacement
        // from the origin (0, 0) to the final position (x, y).
        // Calculate the Euclidean distance from the origin
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + findShortestPath(path));
    }
}
