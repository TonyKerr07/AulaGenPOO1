package POO;

public class ConsoleHerancaProduto extends produto{
	
	private String armazenamento;

	public ConsoleHerancaProduto(String nome, String estilo, String empresa, int preco, int avaliacao,
			String armazenamento) {
		super(nome, estilo, empresa, preco, avaliacao);
		this.armazenamento = armazenamento;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Armazenamento: " + armazenamento);
	}

}
