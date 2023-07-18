package catalogo;

public class Receita {
	private int id;
	private String nome;
	private double custo;
	
	// Método construtor para cadastro de receita
	public Receita(int id, String nome, double custo) {
		this.id = id;
		this.nome = nome;
		this.custo = custo;
		
		System.out.println("Foi cadastrada no ID " + id + " a receita de " + nome + 
				" com custo de R$" + custo +". Grata!");
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getCusto() {
		return custo;
	}

}