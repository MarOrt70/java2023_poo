package pruebas;

public class Operaciones {
	//todas las clases tienen un constructor por defecto.
	//lo crea Java si la clase no tiene constructores creados.
	//public Operaciones();
	//si queremos que desde fuera no creen constructores, creamos uno
	//nosotros y lo hacemos privado.
	
	public int sum(String s, int ... numeros){
		int suma=0;
		for(int num:numeros) {
			suma+=num;
		}				
		return suma;	
	}
	// orden de preferencia:exacta, promocion primitivos,
	// autoboxing(wraper), nºvariable argumentos
	public int multi(int s) {
		return 10;
	}
	public int multi(long k) {
		return 100;
	}
	public int multi(Integer n) {
		return 40;
	}
	public int multi(int ...datos) {
		return 30;
	}
	
	//incumplimiento de sobrecarga. No es válido
	public int div(int ...nums) {
		return 200;
	}
	public int div(int[] valores) {
		return 300;
	}
	
	/////////////////////
}
