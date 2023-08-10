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
		
		FuncionarioVendedor FV1 = new FuncionarioVendedor ("Antonio", 28, "Vendedor Jr",
					"Comercial", 5000, 15, 40);
		FuncionarioVendedor FV2 = new FuncionarioVendedor ("Kerr", 29, "Vendedor Sr",
					"Comercial", 12000, 20, 150);
		
		FV1.visualizar();
		FV2.visualizar();
		
		FuncionarioGerente FG1 = new FuncionarioGerente ("Antonio", 28, "Gerente Operações", 
					"Operações", 15000, 10, "Engenharia de Produção");
		FuncionarioGerente FG2 = new FuncionarioGerente ("Kerr", 29, "Gerente Administrativo", 
					"Financeiro", 19000, 6, "Gestão de Negócios");
		
		FG1.visualizar();
		FG2.visualizar();
		
	}

}
