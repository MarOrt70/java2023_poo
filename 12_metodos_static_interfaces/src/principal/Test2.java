package principal;

import java.util.ArrayList;
import java.util.List;

class Datos2{
	// metodo que devuelva una lista con lso 10 primeros numeros enteros
	public List<Integer>numeros(){
		/*ArrayList<Integer>lst=new ArrayList<>();
		for (int i=1; i<=10; i++) {
			lst.add(i);
		}
		return lst;
	}*/// se puede hacer de otra manera
	//	return List.of(1,2,3,4,5,6,7,8,9,10); //inmutables, esto es una forma, ahora lo oculto para otro ejemplo
		//para crear una lista de 30 numeros creo un array de 100
		Integer[]nums=new Integer [30];
		for (int i=1; i<=30; i++) {
			nums[i-1]=i;
		}
		return List.of(nums);
	}	
}
public class Test2 {

	public static void main(String[] args) {
		Datos2 dt=new Datos2();
		List<Integer> nums=dt.numeros()	;
		for(Integer n:nums) {
			System.out.print(" "+n);
		}

	}

}
