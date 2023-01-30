package Team2.D3.yeongwoo;

public class Main12 {
    public static void main(String[] args) {
        System.out.println(solution(10,100,10));
    }

    public static long solution(int price, int money, int count) {
        long sum = 0;
        long result = 0;
        for (int i = 0; i < count; i++) {
            sum += price;
            result += sum;
        }
        return result > money ? result - money : 0;
    }
}

