package Multithreading;

class Mythread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}
	}
}

public class EvenOddWithSingleChildThread {

	public static void main(String[] args) throws InterruptedException {
		Mythread t = new Mythread();
		t.start();

		Thread.sleep(1000);

		System.out.println("==========================================");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}

	}
}
