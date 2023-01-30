package Team2.D3.leesnagwon;

public class Main15 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 17};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(solution(arr,arr2));
    }

//class Solution15 {
    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i]*b[i]);
        }

        return answer;
    }
}