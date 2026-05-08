package empresa;

public class Euro extends Moeda{
	
	public Euro(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Euro - Valor: " + this.valor);
	}
	
	public double converter() {
		double cotacao = 6.17; // valor do Euro para real
		return this.valor * cotacao;
	}

}
