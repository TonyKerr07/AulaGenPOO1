package POO;

public class AutomovelTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Classe para teste do automóvel
		// Instanciando um objeto da classe automóvel
		
		Automovel auto1 = new Automovel("Antonio Carlos", "Tesla", "KER-1994", 2023);
		
		auto1.imprimirInfo();

		auto1.setNomeProprietario("Antonio Kerr");
		auto1.setPlaca("KER-1J94");
		
		auto1.imprimirInfo();

	}

}
