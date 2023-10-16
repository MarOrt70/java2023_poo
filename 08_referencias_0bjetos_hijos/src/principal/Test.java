package principal;

public class Test {

	public static void main(String[] args) {
		Object ob="Cadena";
		
		String cad=(String)ob;  // cad es hijo, ob es padre
		
		Object oz="300";
		Integer it=(Integer)oz;  //compila pero da exception String no puede cast a Integer
		System.out.println(it);

	}

}
