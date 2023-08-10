package POO;

public class OperarioHerancaPessoa extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public OperarioHerancaPessoa (String nome, String endereco, String cpf, int telefone, int idade, 
			double valorProducao, double comissao) {
			super(nome, endereco, cpf, telefone, idade);
			this.valorProducao = valorProducao;
			this.comissao= comissao;
			
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\nCPF: " + getCpf() 
				+"\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() + 
				"\nEndereco: " + getEndereco() + "\nValor total dos artigos produzidos: "
				+ valorProducao + "\nPorcentagem (sem o %) da comissão: " + comissao);
	}
	
	public void calcularValorArtigo() {
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nA comissão a ser recebido pelo operario " + 
				getNome() + " é igual a: " + valorTotal);
	}
	

}
