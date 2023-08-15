package btvn_buoi3;

import java.util.Scanner;

public class b3_bai4 {

    public static void ktra() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String str = s.nextLine();
        boolean check = true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                check = false;
            }
        }
        System.out.println(check);
    }

    public static void main(String[] args) {
        ktra();
    }
}
