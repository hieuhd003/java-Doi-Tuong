package javaDoiTuong;
import java.util.Scanner;

class NapChong{
    private String name;
    private char gender;
    public NapChong(){
        name = "unknown";
        gender = 'u';
    }
    public NapChong(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name: " + name);
        if(gender == 'm'){
            System.out.println("Gender: male");
        }else 
            if(gender == 'f'){
                System.out.println("Gender: Female");
            }else{
                System.out.println("Gender: Unknown");
            }
        
    }

    }


public class Bai12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("so luong nhap thong tin la: ");
            int n = sc.nextInt();
            sc.nextLine();
            NapChong[] ds = new NapChong[n];

            //nhap thong tin 
            for(int i =0; i < n; i ++){
                System.out.println("sinh vien thu " + ( i + 1));
                System.out.print("nhap ten: ");
                String name = sc.nextLine();
                System.out.print("nhap gioi tinh (n/f/u): ");
                char gender = sc.next().charAt(0);
                sc.nextLine();
                ds[i] = new NapChong(name, gender);
            }

            //xuat dl
            System.out.println("danh sach thong tin");
            for(int i = 0; i < n; i++){
                ds[i].display();
            }

}
    
}
