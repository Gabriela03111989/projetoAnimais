import interfaces.AnimalDeEstimacao;
import interfaces.AnimalDomesticado;

public class Cachorro extends Mamifero implements AnimalDeEstimacao, AnimalDomesticado {

	private boolean fazerExame;

	

	public Cachorro(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
			String corPelo, boolean fazerExame) {
		super(peso, idade, membros, especie, nomeRegistro, glandulasMamarias, corPelo);
		this.fazerExame = fazerExame;
	}

	public void puxaGato(Gato gatoTentativa) {
		System.out.println("Puxando o gato");
	}

	public void correr() {
		System.out.println("O cachorro está correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("O cachorro está roendo osso");
	}

	@Override
	public void locomover() {
		System.out.println("O cachorro está andando");
	}

	@Override
	public void emitirSom() {
		System.out.println("au-au-au");
	}

@Override
public void chamarVeterinario() {
		
	if (fazerExame=true) {
		levarNoVeterinario();
	}else {
		System.out.println("Veterinário a caminho");
	}

	
}

	@Override
	public void levarNoVeterinario() {
		System.out.println("Levando o "+ getNomeRegistro() + " no veterinário");

	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarPraPassear() {
		// TODO Auto-generated method stub

	}

}
