package POO;

public class MedicamentoHerancaFarmacia extends farmacia{
	
	private String recomendado;

	public MedicamentoHerancaFarmacia(String nome, String descricao, String laboratorio, String comprimido, float preco,
			String recomendado) {
		super(nome, descricao, laboratorio, comprimido, preco);
		this.recomendado = recomendado;
	}

	public String getRecomendado() {
		return recomendado;
	}

	public void setRecomendado(String recomendado) {
		this.recomendado = recomendado;
	}
	
	public void visualizacao() {
		super.visualizar();
		System.out.println("Recomendação: " + recomendado);
	}

}
