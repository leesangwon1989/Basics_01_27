package Team2.D1.yuyeong;

public class Main3 {
    public static void main(String[] args) {
    }
}

//유영
class Solution3 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2!=0) {
            answer += s.charAt(s.length() / 2);
        } else {
            answer += String.valueOf(s.charAt(s.length() / 2-1)) + s.charAt(s.length() / 2) + "";
        }
        return answer;
    }
}
