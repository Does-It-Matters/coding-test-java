import java.util.Stack;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class CountDFS {
    static class Node {
        int y;
        int x;
        char c;
        String from;

        Node(int y, int x, char c) {
            this.y = y;
            this.x = x;
            this.c = c;
            from = "start: ";
        }

        Node(int y, int x, char c, int fromY, int fromX) {
            this.y = y;
            this.x = x;
            this.c = c;
            from = "(" + fromY + ", " + fromX + ") -> ";
        }
    }

    public static void exercise(String[] input) {
        // set check table
        boolean[][] remains = new boolean[input.length + 2][input[0].length() + 2];
        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input[0].length(); i++) {
                if ('!' != input[j].charAt(i)){
                    remains[j + 1][i + 1] = true;
                }
            }
        }

        // l r u d
        int[] dx = {-1, 1,  0, 0};
        int[] dy = { 0, 0, -1, 1};

        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input[0].length(); i++) {
                char current = input[j].charAt(i);
                Stack<Node> stack = new Stack<>();

                if (remains[j + 1][i + 1]) {
                    stack.push(new Node(j, i, current));
                    remains[j + 1][i + 1] = false;
                    System.out.printf("%c:", current);

                    // DFS 
                    while (!stack.isEmpty()) {
                        Node node = stack.pop();
                        System.out.printf(" | %s(%d, %d)", node.from, node.y, node.x);

                        // check l r u d 
                        for (int d = 0; d < 4; d++) {
                            if (remains[node.y + 1 + dy[d]][node.x + 1 + dx[d]] == true && input[node.y + dy[d]].charAt(node.x + dx[d]) == current) {
                                stack.push(new Node(node.y + dy[d], node.x + dx[d], current, node.y, node.x));
                                remains[node.y + 1 + dy[d]][node.x + 1 + dx[d]] = false;
                            }
                        }
                    }

                    int count = (!map.containsKey(current)) ? 0 : map.get(current);
                    map.put(current, ++count);
                    System.out.println(" |");
                }
            }
        }

        System.out.println("");
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character c = it.next();
            System.out.println(c + ": " + map.get(c));
        }
    } 
    
    public static void main(String[] args) {
        String[] test = {
            "aabbca",
            "aabbca",
            "bbbbca",
            "ccccca",
            "aabbac",
        };

        exercise(test);
    }
}