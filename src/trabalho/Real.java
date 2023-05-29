package trabalho;

public class Real extends Moeda { //extends para Real ser classe filha de Moeda

	public Real(double valorInicial) { //construtor
		this.valor = valorInicial; //this faz referencia ao "valor" da classe mãe (Moeda)
	}
	
	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	} 
	
	// Método para remover moeda (remover valor da memória)
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;    //conversão
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		return true;
	}
	

}
