package javaDoiTuong;
import java.util.Scanner;
// viet chuong trinh nhap vao chieu rong va chieu dai cua hinh chu nhat va in ra man hinh

class Rectangle{
    double length, width;
    public void getInformation(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("nhap vao chieu dai: ");
            length = sc.nextDouble();
            System.out.print("nhap vao chieu rong: ");
            width = sc.nextDouble();
        }
    }
    public double dientich(){
        return length * width;
    }
    public double chuvi(){
        return (length + width)*2;
    }
    public void display(){
        System.out.println("dien tich= " + dientich());
        System.out.println("chu vi= " + chuvi());
    }

}
public class Bai2 {
    public static void main(String[] args){
    Rectangle s1 = new Rectangle();
    s1.getInformation();
    s1.display();
}
}