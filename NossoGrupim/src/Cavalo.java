
public class Cavalo extends Mamifero {
	
public Cavalo(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, nomeRegistro, glandulasMamarias, corPelo);
	}

public void darCoice() {
	System.out.println("O cavalo deu um coice");
}

@Override
public void alimentar() {
	System.out.println("O cavalo está comendo campim");	
}

@Override
public void locomover() {
	System.out.println("O cavalo está trotando");
}

@Override
public void emitirSom() {
	System.out.println("relichando");	
}
	
}
