package MenorMaiorThread;

public class MenorThread extends Thread {
	int inicio, fim, menor;

	public MenorThread(int ini, int fim) {
		this.inicio = ini; // escopo do trabalho
		this.fim = fim;
	}

	public void run() {
		int i = 0;
		menor = MenorMaior.vetor[i];
		for (i = inicio; i < fim; i++) {
			try {
				if (menor > MenorMaior.vetor[i])
					menor = MenorMaior.vetor[i];
			} catch (Exception e) {
			}
		}

		System.out.println("O menor elemento do vetor eh: " + menor);
	}
}
