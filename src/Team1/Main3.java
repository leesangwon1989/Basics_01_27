package Team1;
public class Main3 {
    public String test(String s) {
        String answer = "";
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else answer = s.substring(s.length()/2,s.length()/2+1);

        return answer;
    }
}