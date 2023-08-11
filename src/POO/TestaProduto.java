package POO;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testar objeto produto
		
		produto prod1 = new produto(
				"Jogo 1", "RPG", "Empresa 1", 199, 5);
		produto prod2 = new produto(
				"Jogo 2", "Luta", "Empresa 2",249, 4);
	
		prod1.visualizar();
		prod2.visualizar();
		
		JogoHerancaProduto JHP1 = new JogoHerancaProduto(
				"Jogo 3", "Esporte", "Empresa 3", 189, 4, "Playstation");
		JogoHerancaProduto JHP2 = new JogoHerancaProduto(
				"Jogo 4", "Tiro", "Empresa 4", 299, 5, "X-Box");
		
		JHP1.visualizar();
		JHP2.visualizar();
		
		ConsoleHerancaProduto CHP1 = new ConsoleHerancaProduto(
				"Playstation", "Novo", "Sony", 5000, 5, "2 TB");
		ConsoleHerancaProduto CHP2 = new ConsoleHerancaProduto(
				"X-Box", "Novo", "Windows", 4000, 4, "1 TB");
		
		CHP1.visualizar();
		CHP2.visualizar();
		
	}

}
