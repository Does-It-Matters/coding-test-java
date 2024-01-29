import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class IntegerBFS{

    public static void exercise(int[][] arr) {
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int[] row: arr) {
            int key = row[0];    
            int value = row[1];
            ArrayList<Integer> list;
            if (!graph.containsKey(key)) {
                list = new ArrayList<>();
                graph.put(key, list);
            } else {
                list = graph.get(key);
            }

            list.add(value);
        }

        HashSet<Integer> checked = new HashSet<>(graph.size());
        Queue<Integer> queue = new LinkedList<>();
   
        int first = arr[0][0];
        queue.offer(first);
        checked.add(first);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            ArrayList<Integer> neighbors = graph.get(current);
            if (neighbors != null) {
                for (Integer neighbor: neighbors) {
                    if (!checked.contains(neighbor)) {
                        queue.offer(neighbor);
                        checked.add(neighbor);
                    }
                }
            }
        } 
    }

    public static void main(String[] args){
        int[][] arr = {
            {10, 20}, 
            {10, 30}, 
            {10, 40}, 
            {10, 50}, 
            {20, 60}, 
            {30, 60}, 
            {60, 70}, 
            {50, 80}, 
            {80, 90}, 
        };
        exercise(arr);
    }
}