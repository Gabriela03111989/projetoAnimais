
public class Canguru extends Mamifero {
	private int utero;
	
public Canguru(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
			String corPelo, int utero) {
		super(peso, idade, membros, especie, nomeRegistro, glandulasMamarias, corPelo);
		this.utero = utero;
	}

public void usarBolsa() {
	System.out.println("O canguru está alimentando seu filhote no marsúpio");
}

@Override
public void alimentar() {
	System.out.println("A mamãe Canguru está comendo uma planta");	
}

@Override
public void locomover() {
	System.out.println("A mamãe Canguru está pulando");
}

@Override
public void emitirSom() {
	System.out.println("tuc-tuc tuc-tuc");	
}
	
}
