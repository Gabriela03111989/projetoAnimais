import interfaces.AnimalDeEstimacao;
import interfaces.AnimalDomesticado;

public class Gato extends Mamifero implements AnimalDeEstimacao,AnimalDomesticado {
	
public Gato(double peso, int idade, int membros, String especie, String nomeRegistro, int glandulasMamarias,
			String corPelo) {
		super(peso, idade, membros, especie, nomeRegistro, glandulasMamarias, corPelo);
	}



public void arranhar() {
	System.out.println("O gato está brincando de arranhar o sofá");
}

@Override
public void alimentar() {
	System.out.println("O gato está bebendo leite");	
}

@Override
public void locomover() {
	System.out.println("o gato está andando");
}

@Override
public void emitirSom() {
	System.out.println("miaaaaaaaaaaaaaaaaaaaau");	
}

@Override
public void chamarVeterinario() {
	// TODO Auto-generated method stub
	
}

@Override
public void levarNoVeterinario() {
	// TODO Auto-generated method stub
	
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
