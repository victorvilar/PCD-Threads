package OperacoesBancariasThread;

public class Conta {

	private float saldo;

	public Conta() {
		saldo = 0f;
	}

	public Conta(float inicial) {
		saldo = inicial;
	}

	public float saldo() {
		return saldo;
	}

	public synchronized void deposita(float valor) {
		saldo = saldo + valor;
	}

	public synchronized void retira(float valor) {
		saldo = saldo - valor;
	}
}
