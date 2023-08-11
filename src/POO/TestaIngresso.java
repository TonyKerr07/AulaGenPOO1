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
		
		VipHerancaIngresso VHI1 = new VipHerancaIngresso(
				"Filme 2", "Cinema 2", "A-1", "Jorge", 10, "Agosto", 2023, "Especial 1");
		VipHerancaIngresso VHI2 = new VipHerancaIngresso(
				"Show 2", "Teatro 2", "VIP", "Pedro", 12, "Agosto", 2023, "Lounge");
		
		VHI1.visualizar();
		VHI2.visualizar();
		
		MeiaHerancaIngresso MHI1 = new MeiaHerancaIngresso(
				"Filme 3", "Cinema 3", "M-8", "Renan", 18, "Agosto", 2023, "131213");
		MeiaHerancaIngresso MHI2 = new MeiaHerancaIngresso(
				"Show 3", "Teatro 3", "L-21", "Gabriel", 17, "Agosto", 2023, "878787");
		
		MHI1.visualizar();
		MHI2.visualizar();		
	}

}
