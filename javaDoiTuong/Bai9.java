package javaDoiTuong;
class tong{
    public static int sumOfArray(int arr[]){
        int sum = 0;
        for(int i = 0; i< arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static double sumOfArray(double arr[]){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
}
public class Bai9 {
    public static void main(String[] args){
        int[] a ={1,2,3,4,5};
    System.out.println("sum a = " + tong.sumOfArray(a) );
    double[] b = {2.3,23.5,34.8};
    System.out.println("sum b = " + tong.sumOfArray(b));
}
}
