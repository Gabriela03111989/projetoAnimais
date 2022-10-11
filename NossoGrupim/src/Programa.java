
public class Programa {
	public static void main(String[] args) {

		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("ESPÉCIE: MARCOPUS RUPUS > CANGURU");
		Canguru kangaroo = new Canguru(50,10,5, "Marcopus rupus", "00152", 20, "vermelho", 2);
		
		kangaroo.alimentar();
		kangaroo.emitirSom();
		kangaroo.locomover();;
		kangaroo.usarBolsa();

		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("ESPÉCIE: ORNITHORHYNCHUS ANATINUS > ORNITORRINCO");
		Ornitorrinco perry = new Ornitorrinco(2, 1, 4, "Ornithorhynchus anatinus", "0256",5, "castanho", false);
		perry.alimentar();
		perry.botarOvo();
		perry.locomover();
		
		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: PEIXE");
		System.out.println("ESPÉCIE: AMPHIPRIONINAE sp. > PEIXE PALHAÇO");
		Nemo marlin = new Nemo(0.1,1, 4, "Amphiprioninae sp.", "03 563", "laranja");
		marlin.mudarSexo(5);
		marlin.emitirSom();
		marlin.soltarBolha();
		
		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: SERPENTE");
		System.out.println("ESPÉCIE: MICRURUS sp. > COBRA CORAL");
		Serpente c1 = new Serpente(2,1,1,"Micrurus sp.", "MC2563", "preto e vermelha");
		c1.alimentar();
		c1.emitirSom();
		c1.locomover();
		c1.trocarPele();
		c1.botarOvo();
		
		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: INSETO");
		System.out.println("ESPÉCIE: COCCINELA sp. > JOANINHA");
		Joaninha francis = new Joaninha (0.1,2,5,"Coccinela sp.", "CC7410852", "preta",4);
		francis.emitirSom();
		francis.alimentar();
		francis.polinizar();
		francis.fingirDeMorta();
		
		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: AVE");
		System.out.println("ESPÉCIE: TROCHILIDAE sp. > BEIJA-FLOR");
		BeijaFlor colibri = new BeijaFlor(0.5,2,4,"Trochilidae sp", "TC7895213", "cinza e amarelo");
		colibri.baterAsasEmOito();
		colibri.fazerNinho();
		colibri.alimentar();
		
		System.out.println("");
		
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: MAMIFERO");
		System.out.println("ESPÉCIE: Canis lupus familiaris > CACHORRINEO");
		Cachorro pacoca = new Cachorro(21,2,4, "Canis lupus familiaris", "Paçoca", 10, "Castanho", true);
		pacoca.chamarVeterinario();
		pacoca.correr();
		
		
		System.out.println("");
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: MAMIFERO");
		System.out.println("ESPÉCIE: Equus ferus > CAVALO");
		Cavalo pirulito = new Cavalo (300,15,4, "Quarto de Milha", "QM52022", 4, "preto");
		

		System.out.println("");
		System.out.println("============= TAXONOMIA & FENÓTIPOS =============");
		System.out.println("REINO: ANIMAL");
		System.out.println("CLASSE: MAMIFERO");
		System.out.println("ESPÉCIE: Felis silvestris catus > GATO");
		Gato pingo = new Gato (4, 6,4,"Persa", "FS25688", 8, "amarelo");
		
		
	}

}
