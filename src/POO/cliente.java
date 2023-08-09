package POO;

public class cliente {
	
	// Atributos
	private String 	nome;
	private String 	endereco;
	private int 	idade;
	private String 	email;
	private int 	telefone;
	
	// Constructor
	public cliente(String nome, String endereco, int idade, String email, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}

	// Metodos Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	// Metodo específico
	public void visualizar() {
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + endereco);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		
	}
	
	
	
}
