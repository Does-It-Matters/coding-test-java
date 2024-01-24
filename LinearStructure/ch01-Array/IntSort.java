import java.util.Arrays;
import java.util.Collections;

public class IntSort {
    public static void exercise(int[] arr) {
        Arrays.sort(arr); showResult(arr);
        
        Integer[] arrInt =  Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrInt, Collections.reverseOrder()); showResult(arrInt);
    }

    public static void showResult(int[] arr){
        for(int e: arr) {
            System.out.println(e);
        }
    }

    public static void showResult(Integer[] arr){
        for(int e: arr) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        int[] arr = {123, 12, 1};
        exercise(arr);
    }
}