package Team2.D1.yeongwoo;

public class Main3 {
    public static void main(String[] args) {
    }
}

class Solution3 {
    public String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : s.charAt(s.length() / 2) + "";
    }
}