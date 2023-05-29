package trabalho;

import java.util.Scanner;

public class Menu {
	
	private Scanner entrada;
	private Cofrinho cofrinho;
	
	
	
	public Menu() {
		entrada = new Scanner(System.in); //Entrada de dados do usuario
		cofrinho = new Cofrinho();
	}

	public void mostrarMenu() {
		System.out.println("COFRINHO");
		System.out.println();
		System.out.println("1 Adicionar moeda:");
		System.out.println("2 Remover moeda:");
		System.out.println("3 Listar moedas:");
		System.out.println("4 Calcular valor total covertido para real");
		System.out.println("Finalizar");
		
		String botaoSelecionado = entrada.next();
		
		//System.out.println(botaoSelecionado); !Testando funcionamento do botão
		
		switch (botaoSelecionado) { // Criando FINALIZAR 
			case "0":
				System.out.println("COFRINHO FINALIZADO");
				break;
				
			case "1":
				mostrarSubMenuAddMoedas();
				mostrarMenu(); //recursão
				break;
				
			case "2":
				mostrarSubMenuRemoverMoedas();
				mostrarMenu();
				break;
				
			case "3":
				cofrinho.listagemMoedas();
				mostrarMenu();
				break;
				
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total convertido para real: " + 
				String.format("%.2f", valorTotalConvertido)); //Formatando para 2 casas decimais
				mostrarMenu();
				break;
				
				
			default:
				System.out.println("!SELEÇÃO INVÁLIDA!");
				mostrarMenu();
				break;
		}
		
	}
	
//---------------ADICIONAR MOEDA--------------------------
	
	private void mostrarSubMenuAddMoedas() {
		System.out.println("Escolha Moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int opcaoMoeda = entrada.nextInt();
	//	System.out.println("moeda escolhida: " + opcaoMoeda); 
		
		System.out.println("Digite o valor:");
		
		String valorTextualMoeda = entrada.next(); //caso o usuario digite ","
		valorTextualMoeda = valorTextualMoeda.replace(",", "."); //converte "," para "."
		double valorMoeda = Double.parseDouble(valorTextualMoeda);//classe Double para converter String -> double
		
		Moeda moeda = null; //nulo para evitar erro na linha 59 (cofrinho.adicionar(moeda);)
		
		if (opcaoMoeda == 1) {
			 moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			 moeda = new Dolar(valorMoeda);
		}else if (opcaoMoeda == 3) {
			 moeda = new Euro(valorMoeda);	
		} else {
			System.out.println("Moeda inválida! ");
			mostrarMenu();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada");
	}
	
	//-------------REMOVER MOEDA-------------------
	
	private void mostrarSubMenuRemoverMoedas() {
		System.out.println("Escolha Moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int opcaoMoeda = entrada.nextInt();
		
		System.out.println("Digite o valor:");
		
		String valorTextualMoeda = entrada.next(); //caso o usuario digite ","
		valorTextualMoeda = valorTextualMoeda.replace(",", "."); //converte "," para "."
		double valorMoeda = Double.parseDouble(valorTextualMoeda);//classe Double para converter String -> double
		
		Moeda moeda = null; //nulo para evitar erro na linha 59 (cofrinho.adicionar(moeda);)
		
		if (opcaoMoeda == 1) {
			 moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			 moeda = new Dolar(valorMoeda);
		}else if (opcaoMoeda == 3) {
			 moeda = new Euro(valorMoeda);	
		} else {
			System.out.println("Moeda inválida! ");
			mostrarMenu();
		}
		
		cofrinho.remover(moeda);
		
	}
	
}
