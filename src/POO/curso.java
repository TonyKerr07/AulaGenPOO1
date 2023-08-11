package POO;

import java.text.NumberFormat;

public class curso {
	
	// Atributos
	private String nome;
	private String escola;
	private int duracao;
	private String periodo;
	private int preco;
	
	// Constructor
	public curso(String nome, String escola, int duracao, String periodo, int preco) {
		super();
		this.nome = nome;
		this.escola = escola;
		this.duracao = duracao;
		this.periodo = periodo;
		this.preco = preco;
	}
	
	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	// Metodos especificos
	
	public String ajustapreco() {
		NumberFormat ap = NumberFormat.getCurrencyInstance(); 	
		ap.setMinimumFractionDigits(2); 						
		String formatoMoeda = ap.format(preco);				
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("\nCurso: " + nome);
		System.out.println("Instituição: " + escola);
		System.out.println("Duração: " + duracao + " meses");
		System.out.println("Periodo: " + periodo);
		System.out.println("Preço: " + this.ajustapreco());
		
	}
	
}
