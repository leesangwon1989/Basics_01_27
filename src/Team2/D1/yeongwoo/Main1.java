package Team2.D1.yeongwoo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}

