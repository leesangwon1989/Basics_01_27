package Team1.D4.leesangwon;

import java.util.Arrays;

public class Main20 {
    public static void main(String[] args) {
        System.out.println();
    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                return answer;
            }
        }
        answer += participant[participant.length - 1];
        return answer;
    }
}