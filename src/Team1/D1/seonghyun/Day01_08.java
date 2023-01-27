package Team1.D1.seonghyun;
//평균 구하기
public class Day01_08 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}

