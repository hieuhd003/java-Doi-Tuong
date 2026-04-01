package javaDoiTuong;

import java.util.Scanner;

// tinh chu vi va dien tich hinh tron
class Bai5Circl{
    private double radius;

    public Bai5Circl(double radius){
        this.radius = radius;
    }
    public Bai5Circl(){

    }
    public double getAre(){//tinh dien tich hinh tron
        return 3.14 * radius * radius;
    }
    public double getCircumference(){
        return 3.14 * 2 * radius;
    }
public void getInformation(){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("nhap vao radius: ");
        radius = sc.nextDouble();
    }
}
    public void dislay(){
        System.out.println("Radius: "+ radius);
        System.out.println("GetAre: "+ getAre());
        System.out.println("GetCircumference: " + getCircumference());
    }
    }



public class Bai5 { 
    public static void main(String[] args){
        Bai5Circl s1 = new Bai5Circl();
        Bai5Circl s2 = new Bai5Circl(2.5);
        s1.getInformation();
        s1.dislay();
        s2.dislay();
    }
}
