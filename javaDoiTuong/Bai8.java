package javaDoiTuong;

class Math {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
}

public class Bai8 {
	public static void main(String[] args) {
		System.out.println(Math.add(2, 4));
		System.out.println(Math.add(3.5, 4.3));
	}
}