
public class Serpente extends Reptil{

	public Serpente(double peso, int idade, int membros, String especie, String nomeRegistro, String corEscama) {
		super(peso, idade, membros, especie, nomeRegistro, corEscama);
		// TODO Auto-generated constructor stub
	}

	public void trocarPele() {
		System.out.println("Trocando de pele");
	}

	@Override
	public void botarOvo() {
		System.out.println("Botando Ovo");
	}


	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void locomover() {
		System.out.println("rastejando");
	}

	@Override
	public void emitirSom() {
		System.out.println("chiiiiiiiiiiiiiiiiii");
		
	}
	
}
