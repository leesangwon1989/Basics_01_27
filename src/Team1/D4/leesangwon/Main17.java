package Team1.D4.leesangwon;

public class Main17 {
    public static void main(String[] args) {
        System.out.println(solution("2124"));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                answer = false;
        }
        return answer;
    }
}
