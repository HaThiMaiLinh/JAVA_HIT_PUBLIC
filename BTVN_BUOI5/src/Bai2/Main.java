/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai2;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so hoc sinh = ");
        n = sc.nextInt();
        Student [] hsinh = new Student[n];

        for(int i = 0 ; i < n ; i++){
            hsinh[i] = new Student();
            System.out.println("Nhap thong tin hoc sinh thu " +(i+1));
            hsinh[i].Input();
        }
        System.out.println("====Thong tin hoc sinh====");
        for(int i = 0 ; i < n ; i++){
            System.out.println();
            System.out.println("===Hoc sinh thu " + (i+1) + "===");
            hsinh[i].Output();
        }
    }
    
}
