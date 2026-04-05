package javaDoiTuong;
 class MyMath{
    public static double PI = 3.14;

    public static int abs(int x){
        return x < 0 ? -x : x;
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y; 
    } 
    public static int min(int x, int y){
        return x < y ? x : y;
    }
    public static int max(int x, int y){
        return x > y ? x : y;
    }
    public static int pow(int x, int y){
        int power = 1;
        for(int i = 0; i < y; i++){
            power *= x;
        }
        return power;
    }
 }
public class Bai7 {

    public static void main(String[] args){
        System.out.println("PI = " + MyMath.PI);
        System.out.println("abs = " + MyMath.abs(-5));
        System.out.println("add = " + MyMath.add(2, 5));
        System.out.println("subtract = " + MyMath.subtract(8, 9));
        System.out.println("min = " + MyMath.min(2, 8));
         System.out.println("min = " + MyMath.max(4,  5));
         System.out.println("pow = " + MyMath.pow(8, 7));
    }
    
}
