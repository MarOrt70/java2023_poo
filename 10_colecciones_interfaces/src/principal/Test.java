package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import service.OperacionesColecciones;

public class Test {

	public static void main(String[] args) {
//crear una lista y un conjunto cualquiera de numeros enteros
//y probar el funcionamiento del método sumar();				
		ArrayList<Integer> lista=new ArrayList<>();
		lista.add(2); lista.add(8); lista.add(4); lista.add(5);
		HashSet<Integer> conjunto=new HashSet<>();
		conjunto.add(7); conjunto.add(4); conjunto.add(9);conjunto.add(5);
//llamamos a sumar	
		OperacionesColecciones oper=new OperacionesColecciones();
		System.out.println("Suma lista: "+oper.sumar(lista));
		System.out.println("Suma conjunto: "+oper.sumar(conjunto));
//llamamos a subconjunto	
		Set<Integer> resultado=oper.subconjunto(lista, conjunto);
		for(Integer in:resultado) {
			System.out.println(in);
		}
	}
	
}
