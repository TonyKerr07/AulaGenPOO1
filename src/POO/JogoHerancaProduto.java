package POO;

public class JogoHerancaProduto extends produto{
	
	private String console;

	public JogoHerancaProduto(String nome, String estilo, String empresa, int preco, int avaliacao, String console) {
		super(nome, estilo, empresa, preco, avaliacao);
		this.console = console;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Console: " + console);
	}

}
