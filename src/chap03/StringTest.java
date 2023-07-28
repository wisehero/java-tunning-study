package chap03;

public class StringTest {
	public static void main(String[] args) {
		String str = "";

		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			str += i;
		}
		long end = System.nanoTime();

		long total = end - start;
		System.out.println("total time = " + total);

		StringBuilder sb = new StringBuilder();

		long start2 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sb.append(i);
		}
		long end2 = System.nanoTime();

		long total2 = end2 - start2;
		System.out.println("total time = " + total2);
	}
}
