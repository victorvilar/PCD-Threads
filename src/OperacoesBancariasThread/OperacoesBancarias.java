package OperacoesBancariasThread;

public class OperacoesBancarias {
	public static void main(String[] args) {

		Conta c = new Conta(100f);

		ThreadDeposita td = new ThreadDeposita(c);
		ThreadRetira tr = new ThreadRetira(c);

		td.start();
		tr.start();

		System.out.println("Saldo da conta: " + c.saldo());
	}
}
