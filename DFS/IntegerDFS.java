import java.util.HashMap;
import java.util.ArrayList;

public class IntegerDFS {
    public static void exercise(int[][] arr) {
        HashMap<Integer, ArrayList> graph = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> tmp;
            if (!graph.containsKey(arr[i][0])) {
                tmp = new ArrayList<>();
                graph.put(arr[i][0], tmp);
            } else {
                tmp = graph.get(arr[i][0]);
            }
            tmp.add(arr[i][1]);
        }

        ArrayList<Integer> checked = new ArrayList<>(graph.size());
        int currentKey = arr[0][0];
        printDFS(graph, currentKey, checked);
    }

    public static void printDFS(HashMap<Integer, ArrayList> graph, int currentKey, ArrayList<Integer> checked) {
        checked.add(currentKey);
        print(currentKey);
        ArrayList<Integer> arr = graph.get(currentKey);
        try {
            // ArrayList<Integer> arr <- java.lang.NullPointerException 
            for (Integer currentKeyCandidate: arr) {
                if (!checked.contains(currentKeyCandidate)) {
                    printDFS(graph, currentKeyCandidate, checked);
                }
            }
        } catch(Exception e) {
        }
    }

    public static void print(Integer currentKey) {
        System.out.print(currentKey + " ");
    }

    public static void showResult(int[] arr){
        for(int e: arr) {
            System.out.println(e);
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