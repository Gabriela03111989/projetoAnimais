
public abstract class Inseto extends Animal {
	private String corAsa;
	private int qntdPatas;

	public Inseto(double peso, int idade, int membros, String especie, String nomeRegistro, String corAsa,
			int qntdPatas) {
		super(peso, idade, membros, especie, nomeRegistro);
		this.corAsa = corAsa;
		this.qntdPatas = qntdPatas;
	}


	public abstract void polinizar();


	public String getCorAsa() {
		return corAsa;
	}


	public void setCorAsa(String corAsa) {
		this.corAsa = corAsa;
	}


	public int getQntdPatas() {
		return qntdPatas;
	}


	public void setQntdPatas(int qntdPatas) {
		this.qntdPatas = qntdPatas;
	}
}
