package javaDoiTuong;
import java.util.Scanner;


class minmax{
    //tim max
    public static int maxOfArray(int arr[]){
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static double maxOfArray(double arr[]){
        double maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //tim min
    public static int minOfArray(int arr[]){
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++){//ar.length số phần tử trong mảng
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static double minOfArray(double arr[]){
        double minValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
public class Bai10 {
    public static void main(String [] args){
        //max
        int[] a = {1,2,3,4,5};
        System.out.println("max a = " + minmax.maxOfArray(a));
        double[] b = {1.1,1.2,1.3,1.4,1.5};
        System.out.println("max b = " + minmax.maxOfArray(b));
        //min
        int[] c = {1,2,3,4,5};
        System.out.println("min c = " + minmax.minOfArray(c));
        double[] d = {1.1,1.2,1.3,1.4,1.5};
        System.out.println("min d = " + minmax.minOfArray(d));
    }
}
