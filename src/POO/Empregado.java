package POO;

import java.text.NumberFormat;

public class Empregado {
	
	// Atributos
	private String nome;
	private double salario;
	
	// Contructor
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	// Métodos constructor (gets e sets)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Métodos específicos
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); 	// Moeda país
		nf.setMinimumFractionDigits(2); 						// Casas decimais
		String formatoMoeda = nf.format(salario);				// Formatar salário
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + " Salário: " + this.formatarMoeda());
	}

}
