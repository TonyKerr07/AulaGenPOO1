package POO;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testar objeto produto
		
		produto prod1 = new produto(
					"Jogo 1", "RPG", "Empresa 1", "Playstation",199);
		produto prod2 = new produto(
				"Jogo 2", "Luta", "Empresa 2", "X-Box",249);
	
		prod1.visualizar();
		prod2.visualizar();
		
	}

}
