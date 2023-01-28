package Team2.D2.seonghyun;

//10번 행렬의 덧셈
public class Day05_01 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }return answer;
    }
}
