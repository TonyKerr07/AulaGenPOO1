package POO;

import java.text.NumberFormat;

public class funcionario {
	
	// Atributos
	private String 	nome;
	private int 	idade;
	private String 	cargo;
	private String 	setor;
	private int 	salario;
	
	// Constructors
	public funcionario(String nome, int idade, String cargo, String setor, int salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
	}


	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	// Metodo específico
	
	
		public String visualizaSalario() {
			NumberFormat nf = NumberFormat.getCurrencyInstance(); 	
			nf.setMinimumFractionDigits(2); 						
			String formatoMoeda = nf.format(salario);				
			return formatoMoeda;
		}
		
		
		public void visualizar() {
			System.out.println("\nNome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Cargo: " + cargo);
			System.out.println("Setor: " + setor);
			System.out.println("Salário: " + this.visualizaSalario());
			
		}
		
	
	
	
	
}
