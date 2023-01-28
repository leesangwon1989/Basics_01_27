package Team1.D1.leesangwon;
public class Main3 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.solution("abc"));
    }
}


    class Solution33 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else answer = s.substring(s.length()/2,s.length()/2+1);

        return answer;
    }
}