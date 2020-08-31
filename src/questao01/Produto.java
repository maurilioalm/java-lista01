package questao01;

public class Produto {

	private int codigo;
	private String nome;

	public Produto() {
	}

	public Produto(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

}
