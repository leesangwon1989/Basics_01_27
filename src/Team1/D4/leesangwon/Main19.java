package Team1.D4.leesangwon;

public class Main19 {
    public static void main(String[] args) {
        System.out.println();
    }

    public String solution(int n) {
       String answer = "";

        for (int i = 0; i < n; i++) {
            if(i % 2 != 0){
                answer += '박';
            }else answer += '수';

        }

        return answer;
    }
}
