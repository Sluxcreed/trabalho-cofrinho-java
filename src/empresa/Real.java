package empresa;

public class Real extends Moeda{
	public Real(double valor) {
		super(valor);
		
	}
	
	public void info() {
		System.out.println("Real - Valor: " + this.valor);
	}
	
	public double converter() {
		return this.valor;
	}

}
