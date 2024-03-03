public class QuickSort {
    public static void exercise(int[] input) {
        // in-place 정렬이므로 반환값 없이 진행
        sort(input);

        for (int key: input) {
            System.out.print(key + " ");
        }
    }

    public static void sort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    public static void quickSort(int[] input, int start, int end) {
        if (start >= end) 
            return;

        int small = start;
        int notSmall = end;
        int key = input[small++];
        while(small <= notSmall) {
            while(small <= notSmall && key > input[small])
                small++;

            while(small <= notSmall && key <= input[notSmall])
                notSmall--;

            if (small < notSmall) {
                int tmp = input[small];
                input[small] = input[notSmall];
                input[notSmall] = tmp;
            }
        }

        int tmp = input[--small];
        input[small] = key;
        input[start] = tmp;

        quickSort(input, start, small);
        quickSort(input, notSmall + 1, end);
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
} 