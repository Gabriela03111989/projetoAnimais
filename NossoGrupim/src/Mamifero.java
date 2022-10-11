
public abstract class Mamifero extends Animal {
	private int glandulasMamarias;
	private String corPelo;
	
	public Mamifero(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, nomeRegistro);
		this.glandulasMamarias = glandulasMamarias;
		this.corPelo = corPelo;
	}

	public int getGlandulasMamarias() {
		return glandulasMamarias;
	}

	public void setGlandulasMamarias(int glandulasMamarias) {
		this.glandulasMamarias = glandulasMamarias;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

}
