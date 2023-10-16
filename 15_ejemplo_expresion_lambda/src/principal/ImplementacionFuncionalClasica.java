package principal;

interface Printer{
	void print(String s);
}
//crear implementacion de la interfaz en la que el método muestre el 
//parámetro por pantalla

//forma clásica crear una clase que implementa la interfac Printer, 
//añado metodo abstracdo(bombilla),añado parametro(syso), creo en main un objeto new, y llámalo



class PrinterPantalla implements Printer{

	@Override
	public void print(String s) {
		System.out.println(s);		
	}
	
}
public class ImplementacionFuncionalClasica {

	public static void main(String[] args) {
		// utilizar implementacion para mostrar teto cualquiero
		Printer printer =new PrinterPantalla();
		printer.print("implementacion clásica");
	}
//como reducir de la línea 12 a la 25, en la otra clase
	// linea 14 y 15
}
