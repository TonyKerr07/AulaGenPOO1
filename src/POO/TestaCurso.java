package POO;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste curso
		
		curso curso1 = new curso(
				"Desenvolvedor", "Generation", 3, "Integral", 1000);
		curso curso2 = new curso(
				"Soft Skills", "Generation", 3, "Noturno", 1500);
		
		curso1.visualizar();
		curso2.visualizar();
		
	}

}
