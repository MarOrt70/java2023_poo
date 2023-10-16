package principal;

import java.util.function.BiPredicate;

public class TestLambda {
	
	 
	public static void main (String[] args) {
/*
mediante lambda, crear una implemtacion de Bipredicate>(Integer,Integer)que deuviela true
solo cuando los numeros sean iguales
BiPredicate<Intege, Integer> impl1=( a,b)  -> if(a==b){return true;} else{return false;}*/
		BiPredicate<Integer,Integer> impl1=(a,b)->a==b;

//la segunda es mas breve.
//Hacer otra que devuelva true si solo ambos numeros son positiovs

		BiPredicate<Integer,Integer> impl2=(a,b)->a>0&&b>0;

/*----------------------------------
Otro. Partiendo de las implementaciones anteriores, crear una implementacion que devuelva
true si ambos numeros son positivos e iguales

BiPredicate<Intege, Integer> impl3=
	  */
	BiPredicate<Integer,Integer> impl3=impl1.and (impl2);
	//pruebas
	System.out.println(impl3.test(2, 3));
	System.out.println(impl3.test(5, 5));
	}
}
