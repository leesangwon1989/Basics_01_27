package Team1.D1.leesangwon;
public class Main3 {
    public static void main(String[] args) {
    }
}


    class Solution3 {
    public String test(String s) {
        String answer = "";
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else answer = s.substring(s.length()/2,s.length()/2+1);

        return answer;
    }
}