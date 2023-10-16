package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import service.ManipulacionesService;

class CriterioPares implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
}
class CriterioNegativos implements Predicate<Integer>{	
	@Override
	public boolean test(Integer t) {
		return (t<0);
	}
}
class GuardaFichero implements Consumer<Integer>{
	
	@Override
	public void accept(Integer t) {
		try(FileOutputStream fos=new FileOutputStream("c:\\temp\\numeros.txt");PrintStream out=new PrintStream(fos)){
			out.println(t);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}	
	}
}
class CriterioLongitud implements Predicate<String>{

	@Override
	public boolean test(String t) {
		
		return t.length()>5;
	}
	
}
public class OperaNumeros {

	public static void main(String[] args) {
		// Inventamos una Lista
		List<Integer> numeros =List.of(-5,5,8,6,-3,12,45);
		//utilizando la clase ManipulacionesService:
		//mostrar la suma de los pares po run lado y la suma de negativos por otro
		ManipulacionesService service=new ManipulacionesService();
		
		System.out.println("Suma pares: "+service.sumarCriterio(numeros, new CriterioPares()));
		System.out.println("Suma negativos: "+service.sumarCriterio(numeros, new CriterioNegativos()));
		
		//guardar un fichero (de direccion cualquiera los multiplos de 5
		service.procesaColeccionPorCriterio(numeros, new CriterioNegativos(), new GuardaFichero());
		
		List<String> nombres=List.of("pan", "cadenalagra","vino","bicicleta");
		List<String> res=service.obtenerCadenaCritero(nombres, new CriterioLongitud());
		System.out.println(res);
	}
	
}
