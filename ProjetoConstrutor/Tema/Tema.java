package ProjetoConstrutor.Tema;

public class Tema {
	private int id;
	private String nome;
	private double valorAluguel;
	private int corToalha;


	public Tema(int id) {
		this.id= id;
	}

	public Tema() {

	}

	public Tema(int id, String nome, double valorAluguel, int corTolha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corTolha;
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
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public int getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(int corToalha) {
		this.corToalha = corToalha;
	}

}
