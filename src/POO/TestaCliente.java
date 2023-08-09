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
		
	}

}
