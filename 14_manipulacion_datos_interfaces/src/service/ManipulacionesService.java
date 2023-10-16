package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ManipulacionesService {
	//crear un metodo que recibe una lista de nmeros y suma los pares
	/*public int sumaPares (List<Integer>numeros) {
		int suma=0;
		for (Integer in:numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}
	//crea otro fque sume los positivos de la lista
	public int sumaPositivos(List<Integer>numeros) {
		int suma=0;
		for (Integer in:numeros) {
			if(in<0) {
				suma+=in;
			}
		}
		return suma;
	}
	//crea otro que sume los multiplos de 5
	// uf otro crear, lo que hacemos es pensar en uno que valga para todo, Predicate, qeu sirva para sumar los libros de la
	//coleeccion que tenga criterio (se coge cualquiera de las anteriores, o se piensa y se cambia el creterio del if
	// */
	public int sumarCriterio(List<Integer>numeros, Predicate<Integer>criterio) {
		int suma=0;
		for (Integer n:numeros) {
			if(criterio.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}	
	//nos encargan 3 nuevos metodos, 1 que rcibe lista de enteros y los imprimi
	//2 recibe lista de enteros y guarda en fichero
	//3 recibe lista de numeros enteros y los manda a la nube
	//pensar hacer 1 que sirva para los tres casos
	public void procesaLista (List<Integer>numeros, Consumer<Integer> consumer) {

		for (Integer in:numeros) {
			consumer.accept(in);//se pone el Consumer punto el metodo accept (haga lo que haga)			
			}
		}
	// metodo que recibe una lista de enteros e imprime los pares
	// metodo que recibe un conjunto de enteros e imprime los positivos
	// metodo que recibe una lista de enteros y manda a la nube los multiples de cinco
	
	public void procesaColeccionPorCriterio (Collection<Integer>numeros, 
											Predicate<Integer>criterio,
											Consumer<Integer>proceso) {
		for (Integer n:numeros) {
			if(criterio.test(n)) {
				proceso.accept(n);
			}		
		}
	}
	// metodo que rcibe coleccion enteros y devuelve la suma de los cuadrados de esos numeros
	// metodo que rcibe coleccion enteros y devuelve la suma de las raices cubicas de esos numeros
	//mirar las cosas comunes, devuelve un int una suma//
	
	public int sumaTransformacion(Collection<Integer>numeros,UnaryOperator<Integer>fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);  // se acumula el resultado de operar el número
		}
		return suma;
	}
	//Metodo que reciba una coleccion de cadenas de texto y devuelva una lista con aquellas 
	//que cumplan con el predicado recibido como parámetro
	
	public List<String> obtenerCadenaCritero (Collection<String>cadenas, Predicate<String>criterio){
		List<String> datos=new ArrayList<>();
		
		for (String s:cadenas) {
			if(criterio.test(s)) {
				datos.add(s);
			}		
		}
		return datos;
		
	}
}

