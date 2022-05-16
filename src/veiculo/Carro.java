package veiculo;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	public Carro(int potenciaCarro, int velocidadeCarro, String nomeCarro) {
		potencia = potenciaCarro;
		velocidade = velocidadeCarro;
		nome = nomeCarro;
	}
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade *= 0.5;
	}
	int getPocentia() {
		return potencia;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	String getNome() {
		return nome;
		}
	
	void imprimir() {
		System.out.println("o carro " + nome + "está a velocidade de " + getVelocidade() + " km/h");
	}
}

