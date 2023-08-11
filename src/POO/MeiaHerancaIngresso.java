package POO;

public class MeiaHerancaIngresso extends ingresso{
	
	private String carteirinha;

	public MeiaHerancaIngresso(String espetaculo, String local, String cadeira, String usuario, int dia, String mes,
			int ano, String carteirinha) {
		super(espetaculo, local, cadeira, usuario, dia, mes, ano);
		this.carteirinha = carteirinha;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Comprovante meia entrada: " + carteirinha);
	}

}
