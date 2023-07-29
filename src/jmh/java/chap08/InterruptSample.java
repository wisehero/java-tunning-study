package chap08;

public class InterruptSample {
	public static void main(String[] args) throws InterruptedException {
		InfiniteThread2 infinite = new InfiniteThread2();
		infinite.start();
		Thread.sleep(2000);
		System.out.println("isInterrupted=" + infinite.isInterrupted());
		infinite.interrupt();
		System.out.println("isInterrupted=" + infinite.isInterrupted());
		infinite.setFlag(false);
	}
}
