package javaDoiTuong;
import java.util.Scanner;
class Bai6Student{
    String name;
    int age;
    public Bai6Student(){

    }
    public Bai6Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age );
    }
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            age = sc.nextInt();
        
    }
}
public class Bai6 {
    public static void main(String[] age){
        Bai6Student[] s1 = new Bai6Student[3];
        Bai6Student[] s2 = new Bai6Student[3];
 
// nhap du lieu vao
        for(int i = 0; i < 3; i++){
            s1[i] = new Bai6Student();
            s1[i].getInformation();

        }
        
       s2[0] = new Bai6Student("Thuan" , 12);
         s2[1] = new Bai6Student("Thuan" , 12);
          s2[2] = new Bai6Student("Thuan" , 12);
//in ra man hinh
        for(int i = 0; i < 3; i++){
            s1[i].display();
            s2[i].display();


        }
    }
    
}
