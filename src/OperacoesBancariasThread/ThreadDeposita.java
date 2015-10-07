package OperacoesBancariasThread;

public class ThreadDeposita extends Thread {

	private Conta c;

	ThreadDeposita(Conta c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {// faz 10 depositos de 100
			c.deposita(100f);
			System.out.println("Depositou: " + 100f + " Saldo: " + c.saldo());
		}
	}

}
