package chap08.synchronize;

/**
 * 각기 다른 기부단체가 각기 다른 기부자에게 기부를 받는다.
 * 즉, 동시성을 고려할 필요가 없다.
 */
public class ContributeTest1 {
	public static void main(String[] args) {
		Contributor[] crs = new Contributor[10];

		for (int loop = 0; loop < 10; loop++) {
			Contribution group = new Contribution();
			crs[loop] = new Contributor(group, "Contributor" + loop);
		}

		for (int loop = 0; loop < 10; loop++) {
			crs[loop].start();
		}
	}
}
