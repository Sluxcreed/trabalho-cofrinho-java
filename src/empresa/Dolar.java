package empresa;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
		
	}
	
	public void info() {
		System.out.println("Dolar - Valor: " + this.valor);
	}
	
	public double converter() {
		double cotacao = 5.32; // valor do Dolar para real
		return this.valor * cotacao;
	}
}
