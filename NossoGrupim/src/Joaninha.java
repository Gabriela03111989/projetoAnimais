
public class Joaninha extends Inseto {

	
	public Joaninha(double peso, int idade, int membros, String especie, String nomeRegistro, String corAsa,
			int qntdPatas) {
		super(peso, idade, membros, especie, nomeRegistro, corAsa, qntdPatas);
	}

	public void fingirDeMorta() {
		System.out.println("Francis está fingindo de morta");
	}

	@Override
	public void polinizar() {
		System.out.println("Francis está Polinizando");
	}

	@Override
	public void alimentar() {
		System.out.println("Francis está almoçando folhas");
	}

	@Override
	public void locomover() {
		System.out.println("Francis está voando");
	}

	@Override
	public void emitirSom() {
		System.out.println("BzZzZzZzZ");
	}
}
