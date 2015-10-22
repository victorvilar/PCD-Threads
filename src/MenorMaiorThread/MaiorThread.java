package MenorMaiorThread;

public class MaiorThread extends Thread {
	int inicio, fim, maior;

	public MaiorThread(int ini, int fim) {
		this.inicio = ini; // escopo do trabalho
		this.fim = fim;
	}

	public void run() {
		int i = 0;
		maior = MenorMaior.vetor[i];
		for (i = inicio; i < fim; i++) {
			try {
				if (maior < MenorMaior.vetor[i])
					maior = MenorMaior.vetor[i];
			} catch (Exception e) {
			}
		}

		System.out.println("O maior elemento do vetor eh: " + maior);
	}
}
