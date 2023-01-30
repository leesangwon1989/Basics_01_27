package Team2.D2.yeongwoo;

public class Main6 {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return 45 - sum;
    }
}
