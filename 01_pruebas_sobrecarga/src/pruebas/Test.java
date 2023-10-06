package pruebas;

public class Test {

	public static void main(String[] args) {
		Operaciones operaciones=new Operaciones();
		
		operaciones.sum("s",3);
		operaciones.sum("b");
		operaciones.sum("c",4,8);
		
		System.out.println(operaciones.multi(3));  //siempre llamará a int
		
	}

}
