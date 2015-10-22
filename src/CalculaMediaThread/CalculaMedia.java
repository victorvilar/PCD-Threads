/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMediaThread;

/**
 *
 * @author jeanmarcoslaine
 */

public class CalculaMedia extends Thread {
	int inicio, termino, thread;

	// construtor
	public CalculaMedia(int ini, int fim, int th) {
		inicio = ini;
		termino = fim;
		thread = th;
	}

	@Override
	public void run() {
		System.out.println();
		System.out.println("Thread: " + thread + " Inicio: " + inicio + " Fim: " + termino);

		for (int i = inicio; i < termino; i++) {
			if (thread == 0)
				MediaMaiorMenor.soma1 += MediaMaiorMenor.vetor[i];
			else
				MediaMaiorMenor.soma2 += MediaMaiorMenor.vetor[i];
		}

	}
}
