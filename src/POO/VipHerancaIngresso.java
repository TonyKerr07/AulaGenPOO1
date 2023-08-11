package POO;

public class VipHerancaIngresso extends ingresso{
	
	private String tipo;

	public VipHerancaIngresso(String espetaculo, String local, String cadeira, String usuario, int dia, String mes,
			int ano, String tipo) {
		super(espetaculo, local, cadeira, usuario, dia, mes, ano);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Setor VIP tipo: " + tipo);
	}

}
