package POO;

public class ClientePessoaJuridica extends cliente{
	
	private String cnpj;
	
	public ClientePessoaJuridica (String nome, String endereco, int idade, String email, int telefone, String cnpj) {
		super(nome, endereco, idade, email, telefone);
		this.cnpj = cnpj;
		
	}

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
		
	}
	
}