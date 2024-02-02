import java.util.Queue;
import java.util.LinkedList;

public class MazeBFS {
    static class Node {
        String previous;
        int y;
        int x;
        int count;

        Node(int y, int x) {
            previous = "start";
            this.y = y;
            this.x = x;
            this.count = 0;
        }

        Node(int previousY, int previousX, int y, int x, int count) {
            previous = "(" + previousY + ", " + previousX + ")";
            this.y = y;
            this.x = x;
            this.count = count;
        }
    }

    public static void exercise(String[] input) {
        int length = input.length;
        int width = input[0].length();
        boolean[][] checked = new boolean[length][width];

        int count = 0;

        Queue<Node> queue = new LinkedList();
        queue.offer(new Node(0, 0));
        checked[0][0] = true;

        // l r u d
        int[] dy = { 0, 0, -1, 1};
        int[] dx = {-1, 1,  0, 0};

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            System.out.printf("%-7s ->  (%d, %d), count: %d \n", now.previous, now.y, now.x ,now.count);
            if (now.y == length - 1 && now.x == width - 1) {
                count = now.count;
                break;
            }

            int tmpCount = now.count + 1;
            for (int i = 0; i < 4; i++) {
                int y = now.y + dy[i];
                int x = now.x + dx[i];
                if (y > -1 && x > -1 && y < length && x < width && !checked[y][x] && 'e' == input[y].charAt(x)) {
                    queue.offer(new Node(now.y, now.x, y, x, tmpCount));
                    checked[y][x] = true;
                }
            }
        }

        System.out.printf("start -> end, count: %d", count);
    } 
    
    public static void main(String[] args) {
        String[] test = {
            "e000e0",
            "eeee00",
            "00eeee",
            "0eee0e",
            "0e0e0e",
        };

        exercise(test);
    }
}