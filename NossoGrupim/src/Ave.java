
public abstract class Ave extends Animal {
	private String corPena;

	public Ave(double peso, int idade, int membros, String especie, String nomeRegistro, String corPena) {
		super(peso, idade, membros, especie, nomeRegistro);
		this.corPena = corPena;
	}

	public abstract void fazerNinho();

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
