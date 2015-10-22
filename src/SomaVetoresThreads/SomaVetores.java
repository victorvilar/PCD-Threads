/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaVetoresThreads;

/**
 *
 * @author jeanmarcoslaine
 */

public class SomaVetores extends Thread {
	int inicio, termino, thread;

	public SomaVetores(int ini, int fim) {
		inicio = ini;
		termino = fim;
	}

	@Override
	public void run() {
		System.out.println("Thread: " + thread + " Inicio: " + inicio + " Fim: " + termino);

		for (int i = inicio; i < termino; i++) {
			// System.out.println(Exemplo1.vetor[i]);
			SomaVet.vetorC[i] = SomaVet.vetorA[i] + SomaVet.vetorB[i];

		}

	}
}
