package service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OperacionesColecciones {
	
//crear un metod que reciba una coleccion de numeros, los sume y devuelva la suma	
	public int sumar (Collection<Integer> coleccion) {
		int suma=0;
		for(Integer in:coleccion) {
			suma+=in;
		}
		return suma;
	}
// realizar un segundo metdo que reciba dos colecciones de numeros
//y devuelva un conjunto(set) con los numeros contenidos en ambas colecciones
	public Set<Integer> subconjunto(Collection<Integer> a, Collection<Integer> b){
		Set<Integer> resultado=new HashSet<>();  //mejor poner los tipos de devulucion general se usen la interfaz 
													//no la clase -- acoplamieto---
		
		for(Integer data:a) {
			if(b.contains(data)) {
				resultado.add(data);
			}
		}
		return resultado;
	}
}
