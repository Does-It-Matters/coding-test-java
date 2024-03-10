public class CountingSort {
    public static void exercise(int[] input) {
        int[] count = new int[101];

        for (int i = 0; i < input.length; ++i) {
            count[input[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length -1; i++) {
            count[i+1] += count[i];
        }

        int[] sort = new int[input.length];
        for (int i = sort.length - 1; i >= 0; i--) {
            sort[count[input[i]]-- - 1] = input[i];
        }

        for (int e: sort) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, 7, 1, 2, 3, 4, 5, 9, 8, 7, 6, 5};
        exercise(input);
    }
} 