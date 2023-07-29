package chap08;

public class Sleep extends Thread {
	public static void main(String[] args) {
		Sleep s = new Sleep();
		s.start();
		try {
			int cnt = 0;
			while (cnt < 5) {
				s.join(1000);
				cnt++;
				System.out.format("%d second waited\n", cnt);
			}
			if (s.isAlive()) {
				s.interrupt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		try {
			Thread.sleep(10000); // 10초간 대기 후 종료
		} catch (InterruptedException e) {
			System.out.println("somebody stop me T T");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
