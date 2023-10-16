package principal;

interface Printer{
	void print(String s);
}
//crear implementacion de la interfaz en la que el método muestre el 
//parámetro por pantalla

// declara variable con lambda; 

public class ImplementacionFuncionalLambdas {

	public static void main(String[] args) {
		Printer printer=s->System.out.println(s);
		printer.print("implementacion con lambdas");
	}

}
