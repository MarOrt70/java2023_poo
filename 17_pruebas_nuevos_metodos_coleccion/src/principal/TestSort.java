package principal;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		List<Integer>numeros=new ArrayList<>(List.of(7,12,9,3,-6,4));
		//ordenar de menor a mayor
		numeros.sort((a,b)->a-b);
		numeros.forEach(n->System.out.println(n));
		
		//ordenar al reves
		numeros.sort((a,b)->b-a);
	//	numeros.forEach(n->System.out.println(n));
		
		List<String> cadenas =new ArrayList<>(List.of("Marcos", "Lucas","Laura", "Angela","Elena"));
		cadenas.sort((a,b)-> a.compareTo(b));  // comparacion lexicográfica
		cadenas.forEach(n->System.out.println(n));
	}

}
