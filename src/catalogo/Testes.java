package catalogo;

public class Testes {
	
	public static void main(String[] args) {
			
			Receita pao = new Receita(01, "Pao", 1.20);
			Receita salgadinho = new Receita(02, "Salgadinho", 35.00);
						
			System.out.println();
		
			Balcao italiano = new Balcao(pao, "un", 2.00);
			Festa salgado = new Festa(salgadinho, "cento", 40.00);
			
			System.out.println();
			
			italiano.setProdutoComFrete();
			italiano.confirmaEntrega();
			italiano.promocao();
			
			System.out.println();
			
			salgado.setProdutoComFrete();
			salgado.confirmaEntrega();

			salgado.setProdutoComFreteECaixa();
			salgado.confirmaEntregaComCaixa();
	}	
}
