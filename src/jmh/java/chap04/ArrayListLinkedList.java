package chap04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	private static final int LOOP_COUNT = 100000;

	static List<Integer> intList = new ArrayList<>();
	static LinkedList<Integer> intLinkedList = new LinkedList<>();

	public static void main(String[] args) {
		linkedListSearchGet();
		linkedListSearchPeek();
	}

	private static long arrayListAddTest() {
		long start = System.nanoTime();
		for (int i = 0; i < LOOP_COUNT; i++) {
			intList.add(i);
		}
		long end = System.nanoTime();
		long total = end - start;
		System.out.println("ArrayList add Test = " + total);

		return total;
	}

	private static long linkedListAddTest() {
		long start = System.nanoTime();
		for (int i = 0; i < LOOP_COUNT; i++) {
			intLinkedList.add(i);
		}
		long end = System.nanoTime();
		long total = end - start;
		System.out.println("LinkedList add Test = " + total);

		return total;
	}

	private static void linkedListSearchGet() {

		for (int i = 0; i < LOOP_COUNT; i++) {
			intLinkedList.add(i);
		}

		long start = System.nanoTime();

		for (int i = 0; i < LOOP_COUNT; i++) {
			Integer result = intLinkedList.get(i);
		}

		long end = System.nanoTime();
		long total = end - start;

		System.out.println("LinkedList get Test = " + total);
	}

	private static void linkedListSearchPeek() {

		for (int i = 0; i < LOOP_COUNT; i++) {
			intLinkedList.add(i);
		}

		long start = System.nanoTime();
		for (int i = 0; i < LOOP_COUNT; i++) {
			Integer result = intLinkedList.peek();
		}
		long end = System.nanoTime();
		long total = end - start;

		System.out.println("LinkedList peek Test = " + total);
	}
}
