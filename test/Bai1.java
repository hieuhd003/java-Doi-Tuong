package test;

import java.util.Scanner;

public class Bai1 {
    // class Student nằm bên trong Bai1
    public static class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void input(Scanner sc) {
            System.out.print("Nhap ten: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Nhap tuoi: ");
            age = sc.nextInt();
        }

        public void display() {
            System.out.println("Name: " + name + " | Age: " + age);
        }
    }
}