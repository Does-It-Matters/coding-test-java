
public class RecursionMergeSort {
    public static void exercise(int[] input) {
        int[] sort = sort(input);

        for (int e: sort) {
            System.out.print(e + " ");
        }
    }

    public static int[] sort(int[] input) {
        int[] sort = mergeSort(input, 0, input.length - 1);
        return sort;
    }

    // original: 원소 하나까지 가기 위해 사용
    // divide한 이후 merge할 때는 반환값을 사용하지, original를 사용하지 않음
    public static int[] mergeSort(int[] original, int start, int end) {
        if (start == end) 
            return new int[] { original[start] };

        int middle = (start + end)/2;
        int[] left = mergeSort(original, start, middle);
        int[] right = mergeSort(original, middle + 1, end);

        return sort(left, right);
    }

    public static int[] sort(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] sort = new int[left.length + right.length];
        while (i < left.length && j < right.length) 
            sort[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        
        while (i < left.length)
            sort[k++] = left[i++];
            
        while (j < right.length)
            sort[k++] = right[j++];

        return sort;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
}