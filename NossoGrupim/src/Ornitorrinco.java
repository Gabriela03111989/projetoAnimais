
public class Ornitorrinco extends Mamifero {
	
private boolean presencaMamilo;

public Ornitorrinco(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
		String corPelo, boolean ausenciaMamilo) {
	super(peso, idade, membros, especie, nomeRegistro, glandulasMamarias, corPelo);
	this.presencaMamilo = ausenciaMamilo;
}

public void botarOvo() {
	System.out.println("Perry está botando ovo ");
}

@Override
public void alimentar() {
	System.out.println("Perry está comendo insetos e camarão");
}

@Override
public void locomover() {
	System.out.println("Perry está nadando");
}

@Override
public void emitirSom() {
	System.out.println("quaqua-quaqua-qua");
}

public boolean isAusenciaMamilo() {
	return presencaMamilo;
}

public void setAusenciaMamilo(boolean ausenciaMamilo) {
	this.presencaMamilo = ausenciaMamilo;
}

}
