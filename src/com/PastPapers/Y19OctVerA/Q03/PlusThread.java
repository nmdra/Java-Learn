package PastPapers.Y19OctVerA.Q03;

public class PlusThread implements Runnable {

	Object lock;
	int start, range;

	public PlusThread(Object lock, int start, int range) {
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void addNumbers(Object lock, int start, int range) {
		synchronized (lock) {

			for(int i = start; i <= range; i++) {
				System.out.println(Thread.currentThread().getName() + " => " + i + " + " + i + " = " + (i + i) );
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
		addNumbers(lock, start, range);
	}

}
