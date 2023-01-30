package Team2.D3.yeongwoo;


import java.util.Calendar;

public class Main13 {
    public static void main(String[] args) {
        System.out.println(solution(3,4));
    }


    public static String solution(int a, int b) {
        String day = "" ;
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a -1,b);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        switch (dayNum) {
            case 1:
                day = "SUN";
                break;
            case 2:
                day = "MON";
                break;
            case 3:
                day = "TUE";
                break;
            case 4:
                day = "WED";
                break;
            case 5:
                day = "THU";
                break;
            case 6:
                day = "FRI";
                break;
            case 7:
                day = "SAT";
                break;
        }
        return day;
    }
}
