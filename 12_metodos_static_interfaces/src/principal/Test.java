package principal;

interface Datos{
	static void print() {
		System.out.println("Interfaz Datos");
	}
}
class Prueba implements Datos{
	static void print() {
		System.out.println("Clase Prueba");
	}
}
public class Test {

	public static void main(String[] args) {
		Prueba.print(); // en caso de que esté vacío prueba no podemos acceder al metodo aunque implemente, pq no lo hereda, no lo ve
						// pero si está con algo si funciona
		Datos.print();// así debemos acceder con el nombre de la interfaz
	}

}
