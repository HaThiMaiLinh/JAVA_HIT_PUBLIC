package btvn_buoi2;

import java.util.Scanner;

public class b2_bai3 {

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

        
        if (n < 2) {
            System.out.println("So " + n + " khong phai la so nguyen to");
        }

        int dem = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                dem++;
            }
        }

        if (dem == 0) {
            System.out.println("So " + n + " la so nguyen to");
        } else {
            System.out.println("So " + n + " khong phai la so nguyen to");
        }
    }

}
