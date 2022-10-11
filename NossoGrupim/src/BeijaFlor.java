
public class BeijaFlor extends Ave{
	
	public BeijaFlor(double peso, int idade, int membros, String especie, String nomeRegistro, String corPena) {
		super(peso, idade, membros, especie, nomeRegistro, corPena);
	}

	public void baterAsasEmOito() {
		System.out.println("Barry está batendo asas rapidamente, formando um oito no ar ");
	}
	
	@Override
	public void fazerNinho() {
		System.out.println("Barry está fazendo o ninho");
	}

	@Override
	public void alimentar() {
		System.out.println("Barry está tomando Mel");
	}

	@Override
	public void locomover() {
		System.out.println("Barry está voando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Lalaland");
	}
}
