package empresa;
import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	private ArrayList <Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda m) { // Adicionar moeda no cofrinho
		listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
	    if (listaMoedas.isEmpty()) {
	        System.out.println("Cofrinho vazio.");
	        return;
	    }

	    Iterator<Moeda> it = listaMoedas.iterator();
	    final double EPS = 1e-9;

	    while (it.hasNext()) {
	        Moeda atual = it.next();
	        if (atual.getClass().equals(m.getClass()) &&
	            Math.abs(atual.getValor() - m.getValor()) < EPS) {
	            it.remove();
	            System.out.println("Moeda removida: ");
	            atual.info();
	            return;
	        }
	    }

	    System.out.println("Moeda não encontrada.");
	}
	
	public void listagemMoedas() {
		if (listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio!");
			return;
		}
		
		for (Moeda m : listaMoedas) {
			m.info(); // Chama o info da classe especifica (Real, Euro ou Dolar)
			System.out.println("");
		}
	}
	
	public double totalConvertido() {
		double total = 0;
		
		for (Moeda m : listaMoedas) {
			total += m.converter(); 
			
		}
		return total;
		
		
	}
}
