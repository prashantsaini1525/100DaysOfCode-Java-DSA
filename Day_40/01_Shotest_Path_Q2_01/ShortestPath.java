// Time Complexity: O(n) || Space Complexity: O(1)
// Problem: Given a string representing a path with directions (N, S, E, W),
// calculate the shortest distance from the starting point (0, 0) to the final position.

public class ShortestPath {

    public static float findShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South 
            if (dir == 'S') {
                y--;
            } //North 
            else if (dir == 'N') {
                y++;
            } //West 
            else if (dir == 'W') {
                x--;
            } //East 
            else if (dir == 'E') {
                x++;
            }
        }
        // After processing all directions, x and y represent the net displacement
        // from the origin (0, 0) to the final position (x, y).
        // Calculate the square of the coordinates
        int X2 = x * x;
        int Y2 = y * y;

        // Calculate the Euclidean distance from the origin
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        String path = "WNEE"; // Example path
        System.out.println("Shortest Path: " + findShortestPath(path));
    }
}
