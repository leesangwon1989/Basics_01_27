package Team2.D3.leesnagwon;

public class Main12 {
    public static void main(String[] args) {
        System.out.println(solution(10,100,10));
    }

        public static long solution(int price, int money, int count) {
            long answer;
            long s = 0;


            for (int i = 0; i < count; i++) {
                s += (long)price * (i + 1);
            }
            answer = (money > s ? 0 : s - money);

            return answer;
        }
    }

