package Team1.D1.leesangwon;

public class Main2 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.solution(15));
    }
}
class Solution22 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}

