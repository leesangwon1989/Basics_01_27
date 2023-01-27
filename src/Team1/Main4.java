package Team1;

import test.Test4;

public class Main4 {
    public String test(int a, int b) {
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
