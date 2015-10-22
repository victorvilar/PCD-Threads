package MenorMaiorThread;

public class MenorMaior {

	public static int[] vetor = new int[100]; // vetor eh "global"

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++)
			vetor[i] = i;// randomicos!
		try {
			MenorThread t1 = new MenorThread(0, 100);
			t1.setPriority(4);
			MaiorThread t2 = new MaiorThread(0, 100);
			t2.setPriority(4);
			Thread.currentThread().setPriority(1);
			t1.start();// inicia a thread t1
			t2.start();
			t1.join();// aguarda a thread t1 terminar
			t2.join();
			System.out.println("Main terminou!");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
