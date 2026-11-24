package Multithreading;

class EvenThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}
	}
}

class OddThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}
	}
}

public class EvenOddWithTwoChildThread {

	public static void main(String[] args) throws InterruptedException {
		EvenThread even = new EvenThread();
		even.start();
		OddThread odd = new OddThread();
		odd.sleep(1000);
		System.out.println("\n======================================\n");
		odd.start();
	}
}
