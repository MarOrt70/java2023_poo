package principal;

import java.util.List;
import java.util.ArrayList;

public class TestRemoveIf {

	public static void main(String[] args) {
		//List<Integer>numeros=List.of(7,12,9,3,-6,4);  //inmutable no se puede tocar
		List<Integer>numeros=new ArrayList<>(List.of(7,12,9,3,-6,4));//crea el array passando el list.of
		//eliminar los negativos
		numeros.removeIf(n->n<0);
		numeros.forEach(n->System.out.println(n));

	}

}
