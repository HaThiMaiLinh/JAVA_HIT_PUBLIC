package btvn_buoi3;

import java.util.Scanner;

public class b3_bai3 {

    public static void sapxep() {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so phan tu mang n = ");
            n = s.nextInt();

        } while (n <= 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i + 1);
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }

        }

        System.out.print("Mang sau khi sap xep: ");
        for (int item : a) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {

        sapxep();
    }
}
