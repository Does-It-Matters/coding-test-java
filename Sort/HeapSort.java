public class HeapSort {
    public static void exercise(int[] input) {
        // 1. get min heap
        int[] minHeap = getMinHeap(input);
        for(int i = 1; i < minHeap.length; i++) { 
            System.out.print(minHeap[i] + " "); 
        }
        System.out.println();

        // 2. sort
        int[] sort = new int[input.length];
        int count = input.length;
        for (int i = 0; i < input.length; i++) {
            sort[i] = minHeap[1];
            minHeap[1] = minHeap[count];
            count--;

            for (int j = 1; (2 * j) <= count; ) {
                int cmp = 2 * j;
                if (cmp + 1 <= count && minHeap[cmp] > minHeap[cmp+1]) {
                    cmp++;
                }

                if (minHeap[j] < minHeap[cmp]) {
                    break;
                }

                int tmp = minHeap[cmp];
                minHeap[cmp] = minHeap[j];
                minHeap[j] = tmp;
                j = cmp;
            }
        }

        for (int i: sort) { System.out.print(i + " "); }
        System.out.println();
    }

    public static int[] getMinHeap(int[] input) {
        int[] minHeap = new int[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            int j;
            // for (j = i + 1, minHeap[j] = input[i]; j > 1 ; j /=2) {
            //     if (minHeap[j/2] > minHeap[j]) {
            //         int tmp = minHeap[j];
            //         minHeap[j] = minHeap[j/2];
            //         minHeap[j/2] = tmp;
            //     } else {
            //         break;
            //     }
            // }
            for (j = i + 1, minHeap[j] = input[i]; j > 1 && minHeap[j/2] > minHeap[j]; j /=2) {
                int tmp = minHeap[j];
                minHeap[j] = minHeap[j/2];
                minHeap[j/2] = tmp;
            }
        }
        return minHeap;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
} 