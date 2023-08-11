package POO;

public class LivreHerancaCurso extends curso{
	
	private String avaliacao;

	public LivreHerancaCurso(String nome, String escola, int duracao, String periodo, int preco, String avaliacao) {
		super(nome, escola, duracao, periodo, preco);
		this.avaliacao = avaliacao;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Avaliação: " + avaliacao);
	}

}
