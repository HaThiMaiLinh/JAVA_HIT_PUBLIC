package btvn_buoi3;

import java.util.Scanner;


public class b3_bai1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang n = ");
        int n = s.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i + 1);
            a[i] = s.nextInt();
            b[i] = -1;
        }

        System.out.println("Mang vua nhap la: ");
        for (int item : a) {
            System.out.print(item + " ");
        }

        for (int i = 0; i < a.length; i++) {
            int dem = 1;
            for (int j = i + 1; j < b.length; j++) {
                if (a[i] == a[j]) {
                    dem++;
                    b[j] = 0;
                }
            }
            
            if (b[i] != 0) {
                b[i] = dem;
            }
        }
        
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println("So " + a[i] + " xuat hien " + b[i] + " lan");
            }
        }

    }

}
