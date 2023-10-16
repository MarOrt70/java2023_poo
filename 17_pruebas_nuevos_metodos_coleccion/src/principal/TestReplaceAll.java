package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Integer>numeros=new ArrayList<>(List.of(7,12,9,3,-6,4));//crea el array passando el list.of/ TODO Auto-generated method stub
		//sustituye cada elemento por su cuadrado 
		numeros.replaceAll(n->n*n);
		numeros.forEach(n->System.out.println(n));
	}

}
