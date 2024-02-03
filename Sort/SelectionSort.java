public class SelectionSort {
    public static void exercise(int[] input) {
        
        int last = input.length - 1;
        for (int i = 0; i < last; i++) {
            
            int min = input[i];
            int minI = i;
            for (int j = i + 1; j < input.length; j++) {
                if (min > input[j]) {
                    min = input[j];
                    minI = j;
                }
            }
            
            int tmp = input[i];
            input[i] = input[minI];
            input[minI] = tmp;
        }

        for(int i: input) { System.out.println(i); }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
}