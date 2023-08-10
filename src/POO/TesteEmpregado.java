package POO;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste do Objeto Empregado com a Heranca Pessoa
		
		EmpregadoHerancaPessoa Empregado1 = new EmpregadoHerancaPessoa("Antonio Kerr", "Rua 1, 648", "11223344556", 998979695, 28, 1, 28000, 15);
		
		Empregado1.imprimirInfo();
		Empregado1.calcularSalario();
		
	}

}
