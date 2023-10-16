package principal;

public class TestInstaceOf {

	public static void main(String[] args) {
	/*	Object ob="300";
		if(ob instanceof String) {		//¿es string de la clase object?
			String s=(String)ob;
			System.out.println(s);
			}else if (ob instanceof Integer) {
			Integer in=(Integer)ob;
			in++;
			}*/
		//mejora en java 17   
		Object ob="300";
		if(ob instanceof String s) {	//lo mism pero si es ya hace el casting
			System.out.println(s);
			}else if (ob instanceof Integer in) {
			in++;
			}
	}
}
