package Team2.D2.yeongwoo;

public class Main10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] a = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                a[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return a;
    }
}
