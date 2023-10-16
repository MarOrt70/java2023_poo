package geometria;

public class DatosFiguraPolimorfismo {

	public static void main(String[] args) {
		mostrarDatos(new Triangulo("naranja",3,6));
		mostrarDatos(new Circulo("rojo",5));

	}
	static void mostrarDatos(Figura fr) {
		System.out.println("Color del "+fr.getClass().getSimpleName()+": "+fr.getColor());
		System.out.println("Superficie del "+fr.getClass().getSimpleName()+": "+fr.superficie());
	}
}
	//getClass	te dice de que clase es
	//getSimpleName	te da el nombre