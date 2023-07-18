package catalogo;


//A classe herda de produto e tem metodo construtor para inclusao de objetos/produtos do tipo BALCÃO.
//Implementada interface que calcula preço do produto com valor de frete
//Implementada interface que calcula desconto de 10% no caixa


public class Balcao extends Produtos implements CalculaDelivery, CalculaPromocao {
	private String tipo = "balcao";
	private double valorDoFrete = 0.1; // 10% do preço
	private double produtoComFrete;

	public Balcao(Receita receita, String unidade, double preco) {
		super.receita = receita;
		super.unidade = unidade;
		super.preco = preco;
				
		System.out.println("--- Cadastro de produto do tipo " + tipo + " ---");
		System.out.println("Confirmacao de inclusao do produto " + receita.getNome()  +
				" com preco de R$" + preco + "/" + unidade + ".");
	}

	public String getTipo() {
		return tipo;
	}
	
	public double getValorDoFrete() {
		return valorDoFrete;
	}

	public double getProdutoComFrete() {
		return produtoComFrete;
	}

	@Override
	public void setProdutoComFrete() {
		this.produtoComFrete = super.preco * valorDoFrete + super.preco;
	}

	@Override
	public void confirmaEntrega() {
		System.out.println("--- Confirmacao de entrega do produto ---");
		System.out.println(receita.getNome() + " / Valor total com frete: R$" + this.produtoComFrete); 
	}

	@Override
	public void promocao() {
		double promocao = super.preco - (super.preco * 0.1);
		System.out.println("Promocao do dia, valor total com desconto de 10%: R$" + promocao);
	}

}