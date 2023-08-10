package POO;

public class FuncionarioVendedor extends funcionario{
	
	private int comissao;
	private int vendas;
	
	public FuncionarioVendedor(String nome, int idade, String cargo, String setor, int salario,
			int comissao, int vendas) {
		super(nome, idade, cargo, setor, salario);
		this.comissao = comissao;
		this.vendas = vendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + comissao + "%");
		System.out.println("Quantidade de vendas: " + vendas);
		
	}
	
	

}
