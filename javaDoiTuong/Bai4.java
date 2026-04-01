package javaDoiTuong;
import java.util.Scanner;

public class Bai4{
    private String name;
    private int age;
    private String gender;
    private double gpa;

   
    public Bai4() {//tao mot constructer rong cho s1

    }

   
    public Bai4(String name, int age, String gender, double gpa){//tao constructer chua tham  so cho s2
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void display(){
       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender); 
        System.out.println("GPA: " + gpa);
    }

    public void getInformation(){
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("nhap vao name: ");
        name = sc.nextLine();

        System.out.print("nhap vao age: ");
        age = sc.nextInt();
        sc.nextLine();//nuot ky tu enter 

        System.out.print("nhap vao gender: ");
        gender = sc.nextLine();

        System.out.print("nhap vao gpa: ");
        gpa = sc.nextDouble();
    }
}

    public static void main(String[] args){
       
        Bai4 s1 = new Bai4();
        Bai4 s2 = new Bai4("HIEU", 20, "NAM", 3.6);
        s2.display();
        s1.getInformation(); // nhập trước
        s1.display();        // hiển thị sau
    }
}