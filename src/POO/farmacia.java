package POO;

import java.text.NumberFormat;

public class farmacia {
	
	//Atributos
	private String nome;
	private String descricao;
	private String laboratorio;
	private String comprimido;
	private float preco;
	
	//Constructor
	public farmacia(String nome, String descricao, String laboratorio, String comprimido, float preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.laboratorio = laboratorio;
		this.comprimido = comprimido;
		this.preco = preco;
	}

	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getComprimido() {
		return comprimido;
	}

	public void setComprimido(String comprimido) {
		this.comprimido = comprimido;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// Metodos específicos
	public String ajustapreco() { 
		NumberFormat ap = NumberFormat.getCurrencyInstance();
		ap.setMinimumFractionDigits(2);
		String precoFormatado = ap.format(preco);
		return precoFormatado;
	}
	
	public void visualizar() {
		System.out.println("\nNome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Laboratório: " + laboratorio);
		System.out.println("Quantidade: " + comprimido);
		System.out.println("Preço: " + this.ajustapreco());
		
	}
	
	

}
