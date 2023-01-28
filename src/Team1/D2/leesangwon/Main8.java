package Team1.D2.leesangwon;

public class Main8 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
//
        System.out.println("결과 : " + s.solution(arr));
    }
}
//arr 평균
class Solution8 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer/ arr.length;
    }
}