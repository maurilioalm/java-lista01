package questao01;

public class TesteEstoqueMain {

	public static void main(String[] args) {
		Produto produto01 = new Produto(1, "Impressora");
		Produto produto02 = new Produto(2, "Teclado");
		Produto produto03 = new Produto(3, "Monitor");
		
		Estoque estoque1 = new Estoque(produto01, 10, 2);
		Estoque estoque2 = new Estoque(produto02, 20, 10);
		Estoque estoque3 = new Estoque(produto03, 5, 2);
		
		try{
			estoque1.darBaixa(5);
			estoque2.reporEstoque(7);
			estoque3.darBaixa(6);
		}
		catch (DomainExceptions e) {
			System.out.println("Error! \n" + e.getMessage());
		}	
		System.out.println(estoque1.relatorio());
		System.out.println(estoque2.relatorio());
		System.out.println(estoque3.relatorio());
		produto02.mudarNome("Teclado Virtual");
		System.out.println(estoque2.relatorio());
	}

}
