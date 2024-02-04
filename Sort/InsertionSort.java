public class InsertionSort {
    public static void exercise(int[] input) {
        for (int i = 1; i < input.length; i++) {
            
            int sortLastI = i - 1;
            for (int j = sortLastI; j > -1; j--) {
                
                if(input[j] <= input[j+1]) {
                    break;
                }

                int tmp = input[j+1];
                input[j+1] = input[j];
                input[j] = tmp;
            }
        }

        for(int i: input) { System.out.println(i); }
    }
    
    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0 };
        exercise(input);
    }
}