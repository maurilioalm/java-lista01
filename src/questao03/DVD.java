package questao03;

public class DVD {
	private boolean estado;
	private String operacaoEmExecucao;

	final boolean LIGADO = true;
	final boolean DESLIGADO = false;

	final String PARADO = "";
	final String REPRODUZINDO = "REPRODUZINDO O DVD";
	final String EM_PAUSA = "REPRODUCAO DO DVD EM PAUSA";
	final String VOLTANDO = "VOLTANDO O DVD";
	final String AVANCANDO = "AVANCANDO O DVD";

	public DVD() {
		this.estado = DESLIGADO;
		operacaoEmExecucao = PARADO;
	}

	public boolean getEstado() {
		return estado;
	}

	public String getOperacaoEmExecucao() {
		return operacaoEmExecucao;
	}

	public void ligar() {
		estado = LIGADO;
		operacaoEmExecucao = PARADO;
	}

	public void desligar() {
		estado = DESLIGADO;
		operacaoEmExecucao = PARADO;
	}

	public void play() {
		if (estado)
			operacaoEmExecucao = REPRODUZINDO;
	}

	public void stop() {
		if (estado)
			operacaoEmExecucao = PARADO;
	}

	public void pause() {
		if (estado)
			operacaoEmExecucao = EM_PAUSA;
	}

	public void voltar() {
		if (estado)
			operacaoEmExecucao = VOLTANDO;
	}

	public void avancar() {
		if (estado)
			operacaoEmExecucao = AVANCANDO;
	}
}
