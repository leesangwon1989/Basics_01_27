package Team1.D1.leesangwon;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
    }
}
class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   //별 수
        int b = sc.nextInt();   //반복 횟수

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

