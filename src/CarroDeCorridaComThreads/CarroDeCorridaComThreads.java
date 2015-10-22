package CarroDeCorridaComThreads;

import java.lang.Thread;

public class CarroDeCorridaComThreads extends Thread {
	private String nome;
	private int distancia;
	private int velocidade;

	public CarroDeCorridaComThreads(String n, int vel) {
		nome = n;
		distancia = 0;
		velocidade = vel;
	}

	public void run() {
		while (distancia <= 1200) {
			System.out.println(nome + " rodou " + distancia + " km.");
			distancia += velocidade;
			// Causa um delay artificial.
			try {
				Thread.sleep(4800 / velocidade);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
