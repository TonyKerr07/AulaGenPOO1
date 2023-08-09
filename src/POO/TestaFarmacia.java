package POO;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste farmácia
		
		farmacia remedio1 = new farmacia(
			"Paracetamol", "Remédio para febre e dores", "Empresa 1", "20 comprimidos",19);
		farmacia remedio2 = new farmacia(
			"Novalgina", "Remédio para febre e dor", "Empresa 2", "25 comprimidos",25);

		remedio1.visualizar();
		remedio2.visualizar();
	}

}
