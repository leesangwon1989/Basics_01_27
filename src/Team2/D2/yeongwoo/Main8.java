package Team2.D2.yeongwoo;

public class Main8 {
    public double solution(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / arr.length;
    }
}
