package Team2.D1.yuyeong;

public class Main4 {
    public static void main(String[] args) {

    }
}

class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a<b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }

        } else if(a>b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        else {
            answer = a;
        }
        return answer;
    }
}
