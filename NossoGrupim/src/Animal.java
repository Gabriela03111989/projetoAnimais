
public abstract class Animal {
	private double peso;
	private int idade;
	private int membros;
	private String especie;
	private String nomeRegistro;

//Construtor Superclass
	
	public abstract void alimentar();

	public Animal(double peso, int idade, int membros, String especie, String nomeRegistro) {
	super();
	this.peso = peso;
	this.idade = idade;
	this.membros = membros;
	this.especie = especie;
	this.nomeRegistro = nomeRegistro;
}

//metodo
	public abstract void locomover();

	public abstract void emitirSom();

	// getter e setter
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNomeRegistro() {
		return nomeRegistro;
	}

	public void setNomeRegistro(String nomeRegistro) {
		this.nomeRegistro = nomeRegistro;
	}
	
}
