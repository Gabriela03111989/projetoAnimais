
public abstract class Peixe extends Animal{
private String corEscama;


public Peixe(double peso, int idade, int membros, String especie, String nomeRegistro, String corEscama) {
	super(peso, idade, membros, especie, nomeRegistro);
	this.corEscama = corEscama;
}

public abstract void soltarBolha();

public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}

}
