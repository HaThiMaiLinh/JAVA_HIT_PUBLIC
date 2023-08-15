package btvn_buoi3;

import java.util.Scanner;

public class b3_bai2 {

    public static void chen() {

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

        int k;
        do {
            System.out.print("Nhap vi tri can chen k = ");
            k = s.nextInt();

            if (k < 0 || k > n) {
                System.out.print("Vi tri chen khong hop le ");

            }
        } while (k < 0 || k > n);

        k--;
        System.out.print("Nhap gia tri can chen x = ");
        int x = s.nextInt();

        int[] newA = new int[n + 1];
        for (int i = 0; i < k; i++) {
            newA[i] = a[i];
        }
        newA[k] = x;
        for (int i = n; i > k; i--) {
            newA[i] = a[i - 1];
        }
        for (int i : newA) {
            System.out.print(i + " ");
        }
    }

    public static void xoa() {

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

        int k;
        do {
            System.out.print("Nhap vi tri can xoa k = ");
            k = s.nextInt();

            if (k < 0 || k > n) {
                System.out.print("Vi tri xoa khong hop le ");

            }
        } while (k < 0 || k > n);

        k--;
        int[] newA = new int[n - 1];
        for (int i = 0; i < k; i++) {
            newA[i] = a[i];
        }
        for (int i = k; i < n - 1; i++) {
            newA[i] = a[i + 1];
        }

        for (int i : newA) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Mang sau khi chen: ");
        chen();
        System.out.println();
        System.out.print("Mang sau khi xoa: ");
        xoa();
    }
}
