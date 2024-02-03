public class BubbleSort {
    public static void exercise(int[] input) {

        // 다양한 연산으로 이루어져 의미가 헷갈리면 변수로 작성하기
        int last = input.length - 1;
        for (int i = 0; i < last; i++) {

            // 다양한 연산으로 이루어져 의미가 헷갈리면 변수로 작성하기
            int currentLast = (last) - i;
            for (int j = 0; j < currentLast; j++) {
            
                if (input[j] > input[j+1]) {
                    int tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = tmp;
                }
            }
        }

        for(int i: input) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 10, 3, 7, 1, 5, 6, 4, 100, -1, 0};
        exercise(input);
    }
}