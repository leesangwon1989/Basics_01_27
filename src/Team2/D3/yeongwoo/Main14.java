package Team2.D3.yeongwoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main14 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 17};
        System.out.println(Arrays.toString(solution(arr, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        int[] a = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(a);
        return a.length == 0 ? new int[]{-1} : a;
    }
}