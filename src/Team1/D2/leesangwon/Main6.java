package Team1.D2.leesangwon;

public class Main6 {
    public static void main(String[] args) {
    }
}
class Solution6 {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int ssum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        for (int j = 0; j < 10; j++) {
            ssum += j;
        }
        answer = ssum -sum;
        return answer;
    }
}

