package javaDoiTuong;

class Student1{
    private String name;
    private int age;

    public Student1(String name, int age){//Là hàm đặc biệt dùng để tạo object
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Bai3{
    public static void main(String[] args){
        Student1 s1 = new Student1("Long", 24);
        Student1 s2 = new Student1("Kien", 29);
        s1.display();
        s2.display();
    }

}