package javaDoiTuong;
import java.util.Scanner;

class Student{
    String name;
    int age;
    public void getInformation(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("nhap vao ten cua ban: ");
            name = sc.next();
            System.out.print("nhap vao tuoi cua ban: ");
            age = sc.nextInt();
        }
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.print("Age: " + age);
    }
}

public class Bai1{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.getInformation();
        s1.display();

        
    }


}