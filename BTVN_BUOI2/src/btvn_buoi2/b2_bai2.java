package btvn_buoi2;

import java.util.Scanner;

public class b2_bai2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen duong n = ");
            n = s.nextInt();
            if (n < 0) {
                System.out.println("n khong hop le. Nhap lai n ");
            }
        } while (n < 0);

        double f = 0;
        for (int i = 1; i <= n; i++) {
            f += 1.0 / i;
        }

        
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            if (i == 0 || i == 1) {
                p = 1;
            } else {
                for (int j = 2; j <= i; j++) {
                    p = p * j;
                }
            }
            sum = sum + p;
        }

        System.out.println("Tong day so S = " + (float)f);
        System.out.println("Tong giai thua cua day so P = " + sum);

    }

}
