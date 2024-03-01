import java.util.Queue;
import java.util.LinkedList;

public class IterationMergeSort {
    public static void exercise(int[] input) {
        // chat gpt 의 도움을 받아 진행하여 느낀점을 작성하는 것으로 대체
        // 정렬된 배열들을 원소로 가진 큐로 진행한다는 것이 흥미로운 점

        // int[] tmp = new int[input.length];
        // Queue<int[]> queue = new LinkedList<>();

        // for (int i = 0; i < input.length; i++) {
        //     queue.offer(new int[] {input[i]});
        // }

        // while (queue.size() > 1) {
        //     queue.offer(merge(queue.poll(), queue.poll()));
        // }

        // int[] result = queue.poll();

        // for (int e: result) {
        //     System.out.print(e + " ");
        // }
    }

    public static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            result[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }

        while (i < a.length) 
            result[k++] = a[i++];
            
        while (j < b.length) 
            result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
}