package principal;
//crear una interfaz para que el resto use esos métodos(todos son abstractos) (linea 3-14)
interface Calculadora{
	int sumar(int a, int b);
	int restar(int a, int b);
	int multiplicar(int a, int b);
	default int sumatorio(int ...nums){  // va a recibir un numero indeterminado de numeros y que los sume
		int resultado=0;
		for(int n:nums) {
			resultado+=n;
		}
		return resultado;
	}
}
interface Estadisticas{
	default int sumatorio(int...datos) {
		return datos[0]+datos[datos.length-1];
	}
}
class Matematicas implements Calculadora,Estadisticas{  //con cual nos quedamos de sumatorio? Obliga a
	// que Matematicas cree el metodo, anulando los otros dos , lo hago en la linea 24-26
	
	@Override
	public int sumatorio(int... nums) {
		// TODO Auto-generated method stub
		return Calculadora.super.sumatorio(nums);  //aquí estamos llamando al de calculadora ya hecho
	}
	@Override
	public int sumar(int a, int b) {
		return a+b;
	}
	@Override
	public int restar(int a, int b) {
		return Math.max(a, b)-Math.min(a, b);
	}
	@Override
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		Matematicas mat=new Matematicas();
		System.out.println(mat.sumatorio(4,8,1,34,11));

	}

}
