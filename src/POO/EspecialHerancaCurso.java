package POO;

public class EspecialHerancaCurso extends curso{
	
	private String pre;

	public EspecialHerancaCurso(String nome, String escola, int duracao, String periodo, int preco, String pre) {
		super(nome, escola, duracao, periodo, preco);
		this.pre = pre;
	}

	public String getPre() {
		return pre;
	}

	public void setPre(String pre) {
		this.pre = pre;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Pré requisitos: " + pre);
	}

}
