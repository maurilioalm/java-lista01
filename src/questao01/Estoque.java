package questao01;

public class Estoque {
	private Produto produto;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
	}

	public Estoque(Produto produto, int qtdAtual, int qtdMinima) {
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public void reporEstoque(int qtd) {
		qtdAtual += qtd;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void darBaixa(int qtd) {
		if (qtdAtual - qtd >= qtdMinima) {
			qtdAtual -= qtd;
		} else {
			throw new DomainExceptions("Operacao não realizada porque viola a quantidade minima do produto no estoque: "
					+ "Codigo:" + produto.getCodigo() + " " + "Nome:" + produto.getNome() + " Quantidade Atual:"
					+ qtdAtual + " Quantidade Minima:" + qtdMinima + " Quantidade da retirada:" + qtd
					+ "\nQuantidade sugerida para fazer a operacao:" + (qtdAtual - qtdMinima));

		}
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public String relatorio() {
		return "Estoque: Produto = " + produto.getNome() + ", Quantidade Atual = " + qtdAtual + ", Quantidade Mínima = "
				+ qtdMinima;
	}

}
