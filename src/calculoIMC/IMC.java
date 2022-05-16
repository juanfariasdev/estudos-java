package calculoIMC;

public class IMC {
	double peso;
	double altura;
	
	public IMC(double pesoPessoa, double alturaPessoa) {
		peso = pesoPessoa;
		altura = alturaPessoa;
	}
	
	public double calcIMC() {
		return peso/(altura * altura);
	}
	
	public String diagnostico() {
		
		double IMC = calcIMC();
		String result = "";
		
		if(IMC < 16) {
			result = "Baixo peso muito grave";
		}
		else if(IMC < 16.99){
			result = "Baixo peso grave";
		}
		else if (IMC < 18.49) {
			result = "Baixo peso";
		}
		else if (IMC < 24.99) {
			result = "Baixo peso";
		}
		else if (IMC < 29.99) {
			result = "Baixo peso";
		}
		else if (IMC < 34.99) {
			result = "Baixo peso";
		}
		else if (IMC < 39.99) {
			result = "Baixo peso";
		}
		else if (IMC > 40) {
			result = "Baixo peso";
		}
		
		return result;
	}

	
}


