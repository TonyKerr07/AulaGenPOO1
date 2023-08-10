package POO;

public class ClientePessoaFisica extends cliente{
	
	private String cpf;
	
	public ClientePessoaFisica(String nome, String endereco, int idade, String email, int telefone, String cpf) {
		super(nome, endereco, idade, email, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
		
	}
	
}
