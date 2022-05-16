package comercio;

public class Compra {
	int valorTotal;
	int numeroParcelas;
	
	//a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	public Compra(int qtdParcelas, int valorParcela) {
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * numeroParcelas;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorParcelas() {
		return valorTotal / numeroParcelas;
	}
	
	public int getValorTotal() {
		return valorTotal;
	}

}
