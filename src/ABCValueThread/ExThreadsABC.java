package ABCValueThread;

class ExThreadsABC {

	static final int MaxThreadChar = 50;

	public static void main(String[] args) {

		try {

			SharedArray array = new SharedArray(MaxThreadChar * 3);

			ArrayWorker t1 = new ArrayWorker(array, MaxThreadChar, 'A');
			ArrayWorker t2 = new ArrayWorker(array, MaxThreadChar, 'B');
			ArrayWorker t3 = new ArrayWorker(array, MaxThreadChar, 'C');

			t1.start();
			t2.start();
			t3.run();

			t1.join();
			t2.join();
			
			System.out.println("A=" + array.countOccurrences('A') + " " + "B=" + array.countOccurrences('B') + " "
					+ "C=" + array.countOccurrences('C'));

		} catch (InterruptedException e) {
		}
	}

}