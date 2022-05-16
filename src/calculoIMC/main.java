package calculoIMC;

public class main {

	public static void main(String[] args) {
		IMC imc = new IMC(70, 1.60);
		String Result = imc.diagnostico();
		
		System.out.println(Result);

	}

}
