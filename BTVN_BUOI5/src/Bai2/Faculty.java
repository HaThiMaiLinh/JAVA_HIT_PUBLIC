/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;
public class Faculty {
    private String Name;
    private String Date;
    private School x;

    public Faculty() {

    }

    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten khoa = ");
        Name = sc.nextLine();
        System.out.print("nhap ngay/thang/nam vao khoa = ");
        Date = sc.nextLine();
        x = new School();
        System.out.print("nhap ten truong = ");
        x.setName(sc.nextLine());
        System.out.print("nhao ngay/thang/nam vao truong = ");
        x.setDate(sc.nextLine());
    }

    public void Output(){
        System.out.println("Ten khoa = " + getName());
        System.out.println("Ngay vao khoa = " + getDate());
        System.out.println("Ten truong = " + x.getName());
        System.out.println("Ngay vao truong = " + x.getDate());
    }
}
