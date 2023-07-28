package main.java;

public class Main {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str.hashCode());

		str += "1233";

		System.out.println(str.hashCode());
	}
}
