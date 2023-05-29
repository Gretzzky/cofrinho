package trabalho;

public class Dolar extends Moeda{

	public Dolar(double valorInicial) { //construtor
		this.valor = valorInicial; 
	}
	
	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
		
	}

	@Override
	public double converter() { //cotação (25/05/23): 5,04
		return this.valor * 5.04;  //apenas retornar sem modificar o valor do dolar
	}
	
	// Método para remover moeda (remover valor da memória)
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;    //conversão
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		return true;
	}

}
