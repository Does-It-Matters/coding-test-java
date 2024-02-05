public class ShellSort {
    public static void exercise2(int[] input) {
        int count = 0;
        // int n = 2;
        int n = input.length;
        for (int interval = n/2; interval > 0; interval /= 2) {
            for (int i = 0 + interval; i < input.length; i++) {
                int key = input[i];
                int j = i;
                while ((j >= interval) && (input[j - interval] > key)) {
                    count++;
                    System.out.printf("%3d, interval: %-3d, input[ %-3d]:%-3d  vs  key:%-3d\n", count, interval, j-interval, input[j-interval], key);

                    input[j] = input[j - interval];
                    j -= interval;
                }

                input[j] = key;
            }

        }

        for(int i: input) { System.out.printf("%d, ", i); }
        System.out.println();
    }

    public static void exercise(int[] input) {
        int count = 0;
        // int n = 2;
        int n = input.length;
        for (int interval = n/2; interval > 0; interval /= 2) {
            for (int i = 0 + interval; i < input.length; i++) {
                int key = input[i];
                int j = i;
                while (j >= interval) {
                    // !(j - interval < 0)
                    // if (j - interval < 0)
                    //     break;
                    
                    count++;
                    System.out.printf("%3d, interval: %-3d, input[ %-3d]:%-3d  vs  key:%-3d\n", count, interval, j-interval, input[j-interval], key);
                    if (input[j - interval] <= key) 
                        break;

                    input[j] = input[j - interval];
                    j -= interval;
                }

                input[j] = key;
            }

        }

        for(int i: input) { System.out.printf("%d, ", i); }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = { 
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
            1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0,
        };
        exercise2(input);
    }
}