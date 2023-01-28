package Team2.D2.seonghyun;

//부족한 금액 계산하기
public class Day05_03 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 0; i < count; i++) {
            sum += price * (i + 1);
            System.out.println(sum);
        }
        answer = (money<sum)?(-sum + money)*-1: 0;
        return answer;
    }
}
//풀고나서 참고
//class Solution {
//    public long solution(long price, long money, long count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }
//}