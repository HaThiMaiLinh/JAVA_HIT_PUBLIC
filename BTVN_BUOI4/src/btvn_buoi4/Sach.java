/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_buoi4;

import java.util.Scanner;

public class Sach {

    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Sach() {
        this.maSach = "";
        this.tenSach = "";
        this.tenTacGia = "";
        this.nhaXuatBan = "";
        this.namXuatBan = 0;
    }

    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        tenTacGia = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = scanner.nextInt();
    }

    public void xuatThongTin() {
        System.out.print(maSach + "\t\t" + tenSach + "\t\t" + tenTacGia + "\t\t" + nhaXuatBan + "\t\t" + namXuatBan);
    }

    public static void main(String[] args) {
        Sach[] list = new Sach[2];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            list[i] = new Sach();
            list[i].nhapThongTin();
        }

        System.out.println("Ma sach" + "\t\t" + "Ten sach" + "\t" + "Tac gia" + "\t\t" + "Nha xuat ban" + "\t" + "Nam xuat ban");
        for (Sach temp : list) {
            temp.xuatThongTin();
            System.out.println("");
        }
    }

}
