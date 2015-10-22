/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaVetoresThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeanmarcoslaine
 */
public class SomaVet {

	public static int[] vetorA;
	public static int[] vetorB;
	public static int[] vetorC;

	public static void main(String[] args) {
		// TODO code application logic here
		vetorA = new int[100];
		vetorB = new int[100];
		vetorC = new int[100];

		for (int i = 0; i < 100; i++) {
			vetorA[i] = 1;
			vetorB[i] = 1;
			vetorC[i] = 0;
		}

		System.out.println("Criando threads");

		SomaVetores thread_a = new SomaVetores(0, 50);
		SomaVetores thread_b = new SomaVetores(50, 100);
		thread_a.start();
		thread_b.start();

		try {
			thread_a.join();
			thread_b.join();
		} catch (InterruptedException ex) {
			//Logger.getLogger(SomaVetoresThreads.class.getName()).log(Level.SEVERE, null, ex);
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(vetorC[i]);
		}

	}

}
