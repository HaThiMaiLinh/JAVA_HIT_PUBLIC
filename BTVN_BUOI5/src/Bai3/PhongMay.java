/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x =new QuanLy();
    int n;
    private May[] y;

    public PhongMay() {

    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, int n, May[] y) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        DienTich = dienTich;
        this.x = x;
        this.n = n;
        this.y = y;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma phong may = ");
        MaPhong=sc.nextLine();
        System.out.print("nhap ten phong = ");
        TenPhong=sc.nextLine();
        System.out.print("nhap dien tich phong (m2)= ");
        DienTich=sc.nextDouble();
        x.Nhap();
        System.out.print("nhap so may tinh cua phong = ");
        n=sc.nextInt();
        this.y=new May[n];
        for(int i = 0; i < n ; i++) {
            System.out.println("--May tinh thu" + (i + 1) + "--");
            y[i]=new May();
            y[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Ma phong may = "+getMaPhong());
        System.out.println("Ten phong = "+getTenPhong());
        System.out.println("Dien tich phong = "+getDienTich() +" m2");
        x.Xuat();
        for(int i = 0 ; i < n ; i++){
            System.out.println();
            System.out.println("===May thu " + (i+1) +"===");
            y[i].Xuat();
        }

    }
}
