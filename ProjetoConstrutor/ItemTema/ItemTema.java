package ProjetoConstrutor.ItemTema;

public class ItemTema {
	private int id;
	private String nome;
	private double descricao;

	public ItemTema(int id) {
		this.id= id;
	}

	public ItemTema() {

	}

	public ItemTema(int id, String nome, double valorAluguel, int corTolha) {
		this.id = id;
		this.nome = nome;
		this.descricao = valorAluguel;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDescricao() {
		return descricao;
	}
	public void setDescricao(double descricao) {
		this.descricao = descricao;
	}

}
