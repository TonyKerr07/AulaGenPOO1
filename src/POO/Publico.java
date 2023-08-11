package POO;

public class Publico extends Telefone{
	
	public Publico() {
		super("Telefone Público");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i = 0; i < numToques; i ++) {
			System.out.println("\nPrimprimprim");
		}
	}
	
	@Override
	public void disca(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8' ) {
			System.out.println("\nEste telefone não liga para celular");
		} else {
			System.out.println("\nDiscando: " + numero);
		}
	}
	
}
