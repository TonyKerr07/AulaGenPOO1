package POO;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Testa cliente com o objeto cliente
		
		cliente cliente1 = new cliente 
				("Antonio Kerr","Rua 1",28,"antonio.kerr@hotmail.com",999999999);
		cliente cliente2 = new cliente 
				("Cliente Dois","Rua 2",29,"emailcliente2@hotmail.com",888888888);
		
		cliente1.visualizar();
		cliente2.visualizar();
		
		ClientePessoaFisica ClPeFi1 = new ClientePessoaFisica 
				("Antonio Kerr","Rua 1",28,"antonio.kerr@hotmail.com",999999999, "78945612300");
		ClientePessoaFisica ClPeFi2 = new ClientePessoaFisica 
				("Antonio Carlos","Rua 2",29,"meuemail@hotmail.com",988888888, "12345678955");

		ClientePessoaJuridica ClPeJu1 = new ClientePessoaJuridica 
				("Empresa A","Rua A",2,"empresaa@hotmail.com",111111111, "12345678912345");
		ClientePessoaJuridica ClPeJu2 = new ClientePessoaJuridica 
				("Empresa B","Rua B",3,"empresab@hotmail.com",222222222, "98765432198765");
		
		ClPeFi1.visualizar();
		ClPeFi2.visualizar();
		ClPeJu1.visualizar();
		ClPeJu2.visualizar();
	}

}
