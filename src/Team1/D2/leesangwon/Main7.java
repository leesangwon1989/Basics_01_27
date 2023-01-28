package Team1.D2.leesangwon;

public class Main7 {
    public static void main(String[] args) {
       }
}
class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123131;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else if (signs[i] == false) {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}



