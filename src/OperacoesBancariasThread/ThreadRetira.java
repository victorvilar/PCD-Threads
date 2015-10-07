package OperacoesBancariasThread;

class ThreadRetira extends Thread {

	private Conta c;

	ThreadRetira(Conta c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {// faz 5 retiradas de 50
			c.retira(50f);
			System.out.println("Retirou: " + 50f + " Saldo: " + c.saldo());
		}
	}

}
