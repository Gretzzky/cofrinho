package trabalho;

public abstract class Moeda {
	
	double valor; //!!!! RETIRAR INFO Protected para classes filhas acessarem
	
	public abstract void info();
	public abstract double converter();

}
