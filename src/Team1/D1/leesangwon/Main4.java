package Team1.D1.leesangwon;

public class Main4 {
    public static void main(String[] args) {

    }
}

class Solution4 {
    public String solution(int a, int b) {
        long answer = 0;
        if(a<=b){
            for(int i=a; i<=b; i++) {
                answer += i;
            }
        }else for(int i=b; i<=a; i++){
            answer += i;
        }

        return answer;
    }
}
