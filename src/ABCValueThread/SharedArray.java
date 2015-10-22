package ABCValueThread;

import java.util.Arrays;

class SharedArray {

	private char[] global_array;
	private int global_ind = 0;

	public SharedArray(int n) {
		global_array = new char[n];
		Arrays.fill(global_array, '-');
	}

	public void addChar(char c) {
		global_array[global_ind] = c;
		TimeSpend.run();
		global_ind++;
	}

	public int countOccurrences(char c) {
		int count = 0;
		for (int i = 0; i < global_array.length; i++)
			if (global_array[i] == c)
				count++;
		return count;
	}

}