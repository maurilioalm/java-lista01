package questao02;

public class ContaCorrente {
	private int numeroConta;
	private String correntista;
	private double saldo;

	public ContaCorrente(int numeroConta, String correntista) {
		this.numeroConta = numeroConta;
		this.correntista = correntista;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public boolean setNumeroConta(int numeroConta) {
		if (numeroConta > 0) {
			this.numeroConta = numeroConta;
			return true;
		}
		return false;
	}

	public String getCorrentista() {
		return correntista;
	}

	public boolean setCorrentista(String correntista) {
		if (correntista == null || correntista.isEmpty()) {
			return false;
		} else {
			this.correntista = correntista;
			return true;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public boolean saque(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, ContaCorrente contaDestino) {
		if (contaDestino != null && valor > 0 && valor <= saldo) {
			contaDestino.deposito(valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nConta Corrente:\n" + "Numero da Conta: " + numeroConta + ", Nome do Correntista: " + correntista
				+ ", Saldo: " + String.format("%.2f", saldo);
	}

}
