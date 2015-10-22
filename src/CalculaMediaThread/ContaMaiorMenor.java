/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMediaThread;

/**
 *
 * @author jeanmarcoslaine
 */

public class ContaMaiorMenor extends Thread {
	int inicio, termino, thread;

	// construtor
	public ContaMaiorMenor(int ini, int fim, int th) {
		inicio = ini;
		termino = fim;
		thread = th;
	}

	@Override
	public void run() {
		System.out.println();
		System.out.println("Thread: " + thread + " Inicio: " + inicio + " Fim: " + termino);

		for (int i = inicio; i < termino; i++) {
			if (MediaMaiorMenor.vetor[i] > MediaMaiorMenor.media)
				MediaMaiorMenor.maior_menor[thread]++;
			else
				MediaMaiorMenor.maior_menor[thread + 1]++;
		}

	}
}
