package ua.step.example;

public class Practica {
	public static void main(String[] args) {
		try {
			System.out.println(area(10, 10));
			System.out.println(area(10, -1));
			System.out.println(area(-1, 10));
			System.out.println(area(-1, -1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int area(int width, int height) throws Exception {
		if (width * height < 0) {
			throw new Exception("неправильно");
		}
		return width * height;

	}
}