package interfaces;
import java.util.Scanner;
public interface External {
	void send(String texto);
	String read(); 
	//Incorporar un metod statico, que proporcione una implementacion de esta interfaz,
	//con envío de los datos a la pantalla  y lectura desde el teclado
	static External envioylectura() {
		return new External() {
			@Override
			public void send(String texto) {
				System.out.println(texto);		
			}
			@Override
			public String read() {
				Scanner sc=new Scanner(System.in);			
				return sc.nextLine();
			}			
		};		
	}
}
