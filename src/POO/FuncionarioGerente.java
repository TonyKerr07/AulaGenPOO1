package POO;

public class FuncionarioGerente extends funcionario{
	
	private int liderados;
	private String formacao;
	
	public FuncionarioGerente(String nome, int idade, String cargo, String setor, int salario,
								int liderados, String formacao) {
		super(nome, idade, cargo, setor, salario);
		this.liderados = liderados;
		this.formacao = formacao;
	}

	public int getLiderados() {
		return liderados;
	}

	public void setLiderados(int liderados) {
		this.liderados = liderados;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de liderados: " + liderados);
		System.out.println("Formação: " + formacao);
		
	}

}
