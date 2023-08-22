/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi4;

import java.util.Scanner;

public class Sinhvien {

    static Scanner sc = new Scanner(System.in);
    public long maSinhVien;
    public String hoTen;
    public int diemToan;
    public int diemLy;
    public int diemHoa;

    public Sinhvien() {
        this.maSinhVien = 0;
        this.hoTen = "";
        this.diemToan = 0;
        this.diemLy = 0;
        this.diemHoa = 0;
    }

    public Sinhvien(long maSinhVien, String hoTen, int diemToan, int diemLy, int diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public long getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setMaSinhVien(long maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLong();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.next();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextInt();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextInt();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextInt();
    }

    public void xuat() {
        System.out.println(this.maSinhVien + "\t\t" + this.hoTen + "\t\t" + this.diemToan + "\t\t" + this.diemLy + "\t\t" + this.diemHoa + "\t\t" + this.diemTB());
    }

    public float diemTB() {
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }

    public static void main(String[] args) {
        
        Sinhvien[] danhSachSinhVien = new Sinhvien[2];
        
        for (int i = 0; i < danhSachSinhVien.length; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            danhSachSinhVien[i] = new Sinhvien();
            danhSachSinhVien[i].nhap();
        }

        System.out.println("MSV" + "\t\t" + "Ho ten" + "\t\t" + "Diem toan" + "\t" + "Diem ly" + "\t\t" + "Diem hoa" + "\t" + "Diem TB");
        for (Sinhvien sv : danhSachSinhVien) {
            sv.xuat();
        }

    }

}
