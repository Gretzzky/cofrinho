package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() { //construtor: 
		this.listaMoedas = new ArrayList<>(); //Lista de moedas
	}
	
	public void adicionar(Moeda moeda) { //método adicionar
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) { //Aviso caso tente consultar lista de moedas vazia
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) { //loop para percorrer lista
			moeda.info();
		}
	}

	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) { 
			valorAcumulado = valorAcumulado + moeda.converter(); //acumulador
		}
		
		return valorAcumulado;
	}

	
	
	
	
}
