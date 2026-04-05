package test;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        // gọi class từ Bai1
        Bai1.Student[] list = new Bai1.Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien thu " + (i + 1));
            list[i] = new Bai1.Student();
            list[i].input(sc);
        }

        System.out.println("\nDanh sach:");
        for (Bai1.Student s : list) {
            s.display();
        }
    }
}