import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ObjectSortComparator {
    static class Node {
        int p1;
        Node(int p1) {
            this.p1 = p1;
        }
    }

    public static void exercise(Node[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(node -> node.p1)); showResult(arr);
        
        Arrays.sort(arr, Comparator.comparingInt((Node node) -> node.p1).reversed()); showResult(arr);
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