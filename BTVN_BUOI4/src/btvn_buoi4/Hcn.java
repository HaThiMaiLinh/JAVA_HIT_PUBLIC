/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi4;

import java.util.Scanner;

public class Hcn {

    Scanner sc = new Scanner(System.in);

    private int chieuDai;
    private int chieuRong;

    public void bai2() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public void bai2(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void nhap() {
        System.out.print("Nhap chieu dai:");
        chieuRong = sc.nextInt();
        System.out.print("Nhap chieu rong:");
        setChieuRong(chieuRong);
        chieuDai = sc.nextInt();
        setChieuDai(chieuDai);
    }

    public void veHinhChuNhat() {

        for (int i = 1; i <= this.chieuRong; i++) {
            for (int j = 1; j <= this.chieuDai; j++) {
                if ((j == 1) || (j == this.chieuDai) || (i == 1) || (i == this.chieuRong)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public float chuVi() {
        float chuVi = (this.chieuDai + this.chieuRong) * 2;
        return chuVi;
    }

    public float dienTich() {
        float dienTich = this.chieuDai * this.chieuRong;
        return dienTich;
    }

    public static void main(String[] args) {
        Hcn hinhChuNhat = new Hcn();
        hinhChuNhat.nhap();
        hinhChuNhat.veHinhChuNhat();
        System.out.println("Chu vi hcn:" + hinhChuNhat.chuVi());
        System.out.println("Dien tich hcn:" + hinhChuNhat.dienTich());
    }
}
