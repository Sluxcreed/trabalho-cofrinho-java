package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Cofrinho cofrinho = new Cofrinho();
		int opcao = 0;
		
	while (true) {	
		System.out.println("\nBem vindo ao Cofrinho MHS\nSelencione a opção desejada");
		System.out.println("1 - Adicionar moedas \n2 - Remover moedas \n3 - Listar moedas \n4 - Calcular total convertido para Real");
		
		opcao = teclado.nextInt();
		
		switch (opcao) {
		
			case 1:
				System.out.println("Escolha a moeda que deseja adicionar: \n1 - Real \n2 - Dólar \n3 - Euro");
				int tipoAdicionar = teclado.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorAdicionar = teclado.nextDouble();
				Moeda moedaAdicionar = null;
				
				if (tipoAdicionar == 1) moedaAdicionar = new Real(valorAdicionar);
				else if (tipoAdicionar == 2) moedaAdicionar = new Dolar(valorAdicionar);
				else if (tipoAdicionar == 3) moedaAdicionar = new Euro(valorAdicionar);
				else {
					System.out.println("Moeda inválida!");
					break;
				}
				
				cofrinho.adicionar(moedaAdicionar);
				System.out.println("Moeda adicionada!");
				break;
				
			case 2:
			    System.out.println("Escolha a moeda que deseja remover: \n1 - Real \n2 - Dólar \n3 - Euro");
			    int tipoRemover = teclado.nextInt();

			    System.out.println("Digite o valor da moeda que deseja remover");
			    double valorRemover = teclado.nextDouble();

			    Moeda moedaRemover = null;

			    if (tipoRemover == 1) moedaRemover = new Real(valorRemover);
			    else if (tipoRemover == 2) moedaRemover = new Dolar(valorRemover);
			    else if (tipoRemover == 3) moedaRemover = new Euro(valorRemover);
			    else {
			        System.out.println("Moeda inválida!");
			        break;
			    }

			    cofrinho.remover(moedaRemover);
			    break;
		
			case 3: 
				System.out.println("LISTAGEM DAS MOEDAS");
				cofrinho.listagemMoedas();
				break;
				
			case 4: 
				double total = cofrinho.totalConvertido();
				System.out.println("Total do cofinho convertido para Real : R$" + total);
				System.out.println("");
				
				
			}
		
		}
	
	
	}
}


