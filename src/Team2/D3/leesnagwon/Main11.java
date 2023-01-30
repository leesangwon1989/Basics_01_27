package Team2.D3.leesnagwon;

import java.util.Arrays;

public class Main11 {
        public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i <n ; i++) {
            answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}