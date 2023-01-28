package Team1.D1.leesangwon;

public class Main4 {
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();
        System.out.println(solution44.solution(5,2));
    }
}

class Solution44 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else for (int i = b; i <= a; i++) {
            answer += i;
        }
        return answer;
    }
}