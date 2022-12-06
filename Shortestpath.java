import java.util.*;

public class Shortestpath {
    public static float shortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'w') {
                x--;
            }
            else if (path.charAt(i) == 'n') {
                y++;
            }
            else if (path.charAt(i) == 'e') {
                x++;
            }
            else  {
                y--;
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]) {
        String path = "ns";
        System.out.print(shortestpath(path));
    }
}