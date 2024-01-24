import java.util.Arrays;
import java.util.Collections;

public class ObjectSortComparable {
    static class Node implements Comparable<Node>{
        int p1;
        Node(int p1) {
            this.p1 = p1;
            c = 0;
        }

        public int compareTo(Node other) {
            return Integer.compare(p1, other.p1);
        }
    }

    public static void exercise(Node[] arr) {
        Arrays.sort(arr); showResult(arr);
        
        Arrays.sort(arr, Collections.reverseOrder()); showResult(arr);
    }

    public static void showResult(Node[] arr){
        for(Node e: arr) {
            System.out.println(e.p1);
        }
    }
    
    public static void main(String[] args){
        Node[] arr = {new Node(2), new Node(9), new Node(6)};
        exercise(arr);
    }
}