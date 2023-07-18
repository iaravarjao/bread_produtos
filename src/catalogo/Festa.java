package catalogo;


//A classe herda de produto e tem mÉtodo construtor para inclusao de objetos/produtos do tipo FESTA.
//Implementada a interface que calcula preço do produto com valor de frete
//Tem métodos específicos para acrescentar preço da caixa para presente (opcional)

public class Festa extends Produtos implements CalculaDelivery{
	protected String tipo = "festa";
	private double valorDoFrete = 0.2; // 20% do preço
	private double produtoComFrete;
	private double produtoComFreteECaixa;
	
	public Festa(Receita receita, String unidade, double preco) {
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
		
	public double getProdutoComFreteECaixa() {
		return produtoComFreteECaixa;
	}

	public void setProdutoComFreteECaixa() {
		this.produtoComFreteECaixa = (super.preco * valorDoFrete) + super.preco + 4.90;
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
	
	public void confirmaEntregaComCaixa() {
		System.out.println("--- Confirmacao de entrega do produto ---");
		System.out.println(receita.getNome() + " / Valor total com frete e caixa para presente: R$" + this.produtoComFreteECaixa);
	}
	
}	