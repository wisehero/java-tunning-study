package chap08;

public class InterruptedSample {
	public static void main(String[] args) throws InterruptedException {
		InfiniteThread infinite = new InfiniteThread();
		infinite.start();
		Thread.sleep(2000);
		System.out.println("isInterrupted = " + infinite.isInterrupted());
		infinite.interrupt();
		System.out.println("isInterrupted = " + infinite.isInterrupted());
	}
}
