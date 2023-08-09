package POO;

import java.text.NumberFormat;

public class produto {
	
	// Atributos
	private String nome;
	private String estilo;
	private String empresa;
	private String console;
	private int preco;
	
	// Constructor
	public produto(String nome, String estilo, String empresa, String console, int preco) {
		super();
		this.nome = nome;
		this.estilo = estilo;
		this.empresa = empresa;
		this.console = console;
		this.preco = preco;
	}
	
	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public String ajustapreco() { 
		NumberFormat ap = NumberFormat.getCurrencyInstance();
		ap.setMinimumFractionDigits(2);
		String precoFormatado = ap.format(preco);
		return precoFormatado;
	}
	
	public void visualizar() {
		System.out.println("\nNome: " + nome);
		System.out.println("Estilo: " + estilo);
		System.out.println("Empresa: " + empresa);
		System.out.println("Console: " + console);
		System.out.println("Preço: " + this.ajustapreco());
		
	}
	
	
	
}
