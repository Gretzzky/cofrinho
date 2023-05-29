package trabalho;

public class Euro extends Moeda {
	
	public Euro(double valorInicial) { //construtor
		this.valor = valorInicial; 
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() { //cotação (25/05/23): 5,40
		return this.valor * 5.4;  //apenas retornar sem modificar o valor do dolar
	}

	// Método para remover moeda (remover valor da memória)
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;    //conversão
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
		return true;
	}
}



