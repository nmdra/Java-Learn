package PastPapers.Y19OctVerA.Q03;

public class MultiplyThread implements Runnable {

	Object lock;
	int start, range;

	public MultiplyThread(Object lock, int start, int range) {
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void multiplyNumbers(Object lock, int start, int range) {
		synchronized (lock) {

			for(int i = start; i <= range; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i + " x " + i + " = " + (i * i) );

				try {
					Thread.sleep(1000);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lock.notifyAll();
		}
	}

	@Override
	public void run() {
		multiplyNumbers(lock, start, range);
	}

}