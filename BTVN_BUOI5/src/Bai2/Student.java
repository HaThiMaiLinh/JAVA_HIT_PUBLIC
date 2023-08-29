/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;
public class Student {
     private String Name;
    private String lop;
    private double Score;
    private Faculty y;

    public Student() {

    }

    public Student(String name, String lop, double score, Faculty y) {
        Name = name;
        this.lop = lop;
        Score = score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten hoc sinh = ");
        Name = sc.nextLine();
        System.out.print("nhap ten lop = " );
        lop=sc.nextLine();
        System.out.print("nhap diem trung binh = ");
        Score=sc.nextDouble();
        y = new Faculty();
        y.Input();
    }

    public void Output(){
        System.out.println("Ten hoc sinh = " + getName());
        System.out.println("Ten lop = " + getLop());
        System.out.println("Diem trung binh = " + getScore());
        y.Output();
    }
}
