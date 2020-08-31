package questao03;

import java.util.Scanner;

public class AplicacaoDVD {

	public static void main(String[] args) {

		DVD som = new DVD();
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o comando desejado:" + "\n" + "1 - ligar" + "\n" + "2 - desligar" + "\n"
				+ "3 - play" + "\n" + "4 - stop" + "\n" + "5 - pause" + "\n" + "6 - avancar" + "\n" + "7 - voltar"
				+ "\n" + "8 - sair");
		int comando = sc.nextInt();
		while (comando != 8) {
			switch (comando) {
			case 1:
				som.ligar();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				}
				break;

			case 2:
				som.desligar();
				if (!som.getEstado()) {
					System.out.println("DESLIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				}
				break;
			case 3:
				som.play();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				} else {
					comando = sc.nextInt();
				}
				break;
			case 4:
				som.stop();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				} else {
					comando = sc.nextInt();
				}
				break;
			case 5:
				som.pause();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				} else {
					comando = sc.nextInt();
				}
				break;
			case 6:
				som.avancar();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				} else {
					comando = sc.nextInt();
				}
				break;
			case 7:
				som.voltar();
				if (som.getEstado()) {
					System.out.println("LIGADO");
					System.out.println(som.getOperacaoEmExecucao());
					comando = sc.nextInt();
				} else {
					comando = sc.nextInt();
				}
				break;
			default:
				comando = sc.nextInt();
			}
		}
		sc.close();
	}
}
