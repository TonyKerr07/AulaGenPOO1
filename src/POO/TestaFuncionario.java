package POO;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testar objeto funcionário
		
		funcionario Func1 = new funcionario(
					"Antonio Kerr", 28, "Desenvolvedor Sr", "Desenvolvimento",10000);
		funcionario Func2 = new funcionario(
				"Funcionário Dois", 22, "Desenvolvedor Jr", "Desenvolvimento",5000);

		Func1.visualizar();
		Func2.visualizar();
		
	}

}
