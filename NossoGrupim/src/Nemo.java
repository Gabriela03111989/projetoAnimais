
public class Nemo extends Peixe {

	
	

	public Nemo(double peso, int idade, int membros, String especie, String nomeRegistro, String corEscama) {
		super(peso, idade, membros, especie, nomeRegistro, corEscama);
	}

	public void mudarSexo(int getIdade) {
		if (getIdade > 3) {
			System.out.println("Marlin é femea");
		} else if (getIdade < 3) {
			System.out.println("Marlin é macho");
		}
	}

	@Override
	public void soltarBolha() {
		System.out.println("Marlin está soltando bolha");
	}

	@Override
	public void alimentar() {
		System.out.println("Marlin está comendo algas");
	}

	@Override
	public void locomover() {
		System.out.println("Marlin está nadando na Anêmonas");
	}

	@Override
	public void emitirSom() {
		System.out.println("ablubleble");

	}
}
