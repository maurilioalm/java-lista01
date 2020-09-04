package questao02;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoContas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ContaCorrente> list = new ArrayList<ContaCorrente>();
		System.out.print("Digite a quantidade de contas que serao cadastradas: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int numero = 0;
			while (numero <= 0) {
				System.out.println("Digite os dados da Conta Corrente #" + i);
				System.out.print("Digite o numero da conta: ");
				numero = sc.nextInt();
			}
			System.out.print("Digite o nome do correntista: ");
			String nome = sc.next();
			ContaCorrente conta = new ContaCorrente(numero, nome);
			list.add(conta);

			System.out.println();
		}
		int aux = 0;
		while (aux != 5) {
			System.out.println("\nDigite um numero de 1 a 4 para selecionar a operação:");
			System.out.println("1 - Dados da Conta");
			System.out.println("2 - Deposito");
			System.out.println("3 - Saque");
			System.out.println("4 - Transferência");
			System.out.println("5 - Sair");
			aux = sc.nextInt();

			switch (aux) {
			case 1:
				byte count = 0;
				System.out.println("Dados da Conta:");
				System.out.print("Digite o numero da conta: ");
				int numero = sc.nextInt();
				for (ContaCorrente conta : list) {
					if (conta.getNumeroConta() == numero) {
						System.out.println(conta);
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println("Conta não localizada");
				}

				break;
			case 2:
				count = 0;
				System.out.println("Deposito");
				System.out.print("Digite o numero da conta que recebera o valor: ");
				numero = sc.nextInt();
				for (ContaCorrente conta : list) {
					if (conta.getNumeroConta() == numero) {
						System.out.print("Digite o valor que será depositado: ");
						double valor = sc.nextDouble();
						if (conta.deposito(valor)) {
							System.out.println("Deposito realizado com sucesso");
							count++;
							break;
						}
						if (valor <= 0) {
							System.out.println("Saque não realizado, valor incorreto");
							count++;
							break;
						} else {
							System.out.println("O deposito não foi realizado");
							count++;
						}
					}
				}
				if (count == 0) {
					System.out.println("Conta não localizada");
				}
				break;

			case 3:
				count = 0;
				System.out.println("Saque");
				System.out.print("Digite o numero da conta: ");
				numero = sc.nextInt();
				for (ContaCorrente conta : list) {
					if (conta.getNumeroConta() == numero) {
						count++;
						System.out.print("Digite o valor que será sacado: ");
						double valor = sc.nextDouble();
						if (conta.saque(valor)) {
							System.out.println("Saque realizado");
							System.out.println("Novo Saldo: " + String.format("%.2f", conta.getSaldo()));
							break;
						}
						if (valor <= 0) {
							System.out.println("Saque não realizado, valor incorreto");
							break;
						} else {
							System.out.println("Saque não realizado verifique seu saldo");
							System.out.println("Saldo: " + String.format("%.2f", conta.getSaldo()));
							break;
						}
					}
				}
				if (count == 0) {
					System.out.println("Conta não localizada");
				}
				break;

			case 4:
				count = 0;
				System.out.println("transferencia");
				System.out.print("Digite o numero da conta de origem: ");
				numero = sc.nextInt();
				System.out.print("Digite o numero da conta de destino: ");
				int numeroaux = sc.nextInt();
				for (ContaCorrente conta : list) {
					if (conta.getNumeroConta() == numero) {
						count++;
						for (ContaCorrente conta2 : list) {
							if (conta2.getNumeroConta() == numeroaux) {
								count++;
								System.out.print("Digite o valor que será transferido: ");
								double valor = sc.nextDouble();
								if (conta.saque(valor)) {
									if (conta2.deposito(valor)) {
										System.out.println("Transferencia realizada");
										System.out.println("Novo Saldo: " + String.format("%.2f", conta.getSaldo()));
										break;
									}
								}
								if (valor <= 0) {
									System.out.println("Tranferencia não pode ser realizada, valor incorreto");
									break;
								} else {
									System.out.println("Tranferencia não pode ser realizada, saldo insuficiente");
									System.out.println("Saldo: " + String.format("%.2f", conta.getSaldo()));
								}
							}
						}
					}
				}
				switch (count) {
				case 0:
					System.out.println("Conta de origem não localizada");
					break;
				case 1:
					System.out.println("Conta de destino não localizada");
					break;
				}
				break;
			}
		}
		sc.close();
	}
}
