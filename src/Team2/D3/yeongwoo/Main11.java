package Team2.D3.yeongwoo;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,5)));
    }

    public static long[] solution(int x, int n) {
        long[] a = new long[n];
        long j = 0;
        for (int i = 0; i < n; i++) {
            a[i] = j += x;
        }
        return a;
    }
}