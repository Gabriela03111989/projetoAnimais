
public abstract class Reptil extends Animal {

	private String corEscama;

	public Reptil(double peso, int idade, int membros, String especie, String nomeRegistro, String corEscama) {
		super(peso, idade, membros, especie, nomeRegistro);
		this.corEscama = corEscama;
	}

	public abstract void botarOvo();
	
//getter e setter	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
