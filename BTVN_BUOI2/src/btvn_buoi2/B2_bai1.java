package btvn_buoi2;

import java.util.Scanner;

public class B2_bai1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap do dai canh hinh vuong n = ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1) || (j == n) || (i == 1) || (i == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

}
