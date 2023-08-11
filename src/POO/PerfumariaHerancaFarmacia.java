package POO;

public class PerfumariaHerancaFarmacia extends farmacia{
	
	private String regiao;

	public PerfumariaHerancaFarmacia(String nome, String descricao, String laboratorio, String comprimido, float preco,
			String regiao) {
		super(nome, descricao, laboratorio, comprimido, preco);
		this.regiao = regiao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public void visualizacao() {
		super.visualizar();
		System.out.println("Local de aplicação: " + regiao);
	}
}
