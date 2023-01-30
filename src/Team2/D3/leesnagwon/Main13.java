package Team2.D3.leesnagwon;


public class Main13 {
    public static void main(String[] args) {
        System.out.println(solution(3,4));
    }


    public static String solution(int a, int b) {

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] d = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int all = 0;
        for (int i = 0; i < a-1; i++) {
            all += d[i];
        }
        all += b - 1;
        return day[all % 7];
    }
}
