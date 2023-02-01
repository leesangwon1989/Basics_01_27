package Team1.D4.leesangwon;

public class Main16 {

    public static void main(String[] args) {

        System.out.println(solution("ppyy"));
    }

    static boolean solution(String s) {
        boolean answer = true;
        char[] k = s.toUpperCase().toCharArray();
        int p = 0;
        int y = 0;
        for (int i = 0; i < k.length; i++) {
            char temp = k[i];
            if (temp == 'Y')
                y++;
            if (temp == 'P')
                p++;

        }
        System.out.println(p);
        if (p == 0 && y == 0)
            answer = true;
        if (p != y)
            answer = false;

        System.out.println(y);
        return answer;
    }
}

