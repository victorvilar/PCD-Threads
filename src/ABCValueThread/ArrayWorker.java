package ABCValueThread;

class ArrayWorker extends Thread {

	private SharedArray a;
	private int count;
	private char c;

	ArrayWorker(SharedArray a, int count, char c) {
		this.a = a;
		this.count = count;
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < count; i++) {
			TimeSpend.run();
			a.addChar(c);
		}
	}
}