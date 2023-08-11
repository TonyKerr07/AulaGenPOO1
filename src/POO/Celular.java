package POO;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nTriiiiiiim");
			break;
		case 2: 
			System.out.println("\nOh Neymaaaaaar");
			break;
		default:
			System.out.println("Aaaaaaaaaaa");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: " + numero + " é um celular");
	}
}
