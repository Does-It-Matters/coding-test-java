public class CountingSort {
    public static void exercise(int[] input) {
        int[] count = new int[101];

        for (int i = 0; i < input.length; ++i) {
            count[input[i]]++;
        }

        int j = 0;
        for (int i = 0; i < 101; i++) {
            for (; 0 < count[i]; --count[i], ++j) {
                input[j] = i;
            }
        }

        for (int e: input) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, 7, 1, 2, 3, 4, 5, 9, 8, 7, 6, 5};
        exercise(input);
    }
} 