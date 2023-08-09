package POO;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testando ingresso
		
		ingresso ticket1 = new ingresso(
				"Filme 1", "Cinema 1", "C-12", "Antonio", 9, "Agosto", 2023);
		ingresso ticket2 = new ingresso(
				"Show 1", "Teatro 1", "Pista", "Carlos", 11, "Agosto", 2023);
		
		ticket1.visualizar();
		ticket2.visualizar();
		
	}

}
