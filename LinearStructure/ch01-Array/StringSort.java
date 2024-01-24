import java.util.Arrays;
import java.util.Collections;

public class StringSort {
    public static void exercise(String[] arr) {
        Arrays.sort(arr); showResult(arr);

        Arrays.sort(arr, Collections.reverseOrder()); showResult(arr);
    }

    public static void showResult(String[] arr){
        for(String e: arr) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        String[] arr = {"abc", "ab", "a"};
        exercise(arr);
    }
}