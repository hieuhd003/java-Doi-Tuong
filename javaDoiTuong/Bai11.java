package javaDoiTuong;
// nạp chồng hàm khởi tạo
class napchong {
    private String name;
    private char gender;
    public napchong(){
        name = "Unknown";
        gender = 'u';
    } 
    public napchong(String name){
        this.name = name;
        this.gender = 'u';
    }
    public napchong(char gender){
        this.name = "Unknown";
        this.gender = gender;
    }
    public napchong(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    //hien thi ket qua
    public void display(){
        System.out.println("Name: " + name);
        if(gender == 'u'){
            System.out.println("Gender: Unknown");
        }
        if(gender == 'm'){
            System.out.println("Gender: Male");
        }
        if(gender == 'f'){
            System.out.println("Gender: Female");
        }
    }
}
public class Bai11 {
    public static void main(String[] arge){
      napchong s1 = new napchong();
        napchong s2 = new napchong("Hieu");
        napchong s3 = new napchong('m');
        napchong s4 = new napchong("An", 'f');

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }


    }
