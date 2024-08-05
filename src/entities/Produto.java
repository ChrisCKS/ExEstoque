package entities;

public class Produto {

	public String nome; 
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int alteracao) {
		quantidade += alteracao;
	}
	
	public void removerProduto(int alteracao) {
		quantidade -= alteracao;
	}
	
	public String toString() {
		return nome
			+ ", $"
			+ preco
			+ ", "
			+ quantidade
			+ " unidades, Total: $ "
			+ valorTotalEstoque();
	}
}

