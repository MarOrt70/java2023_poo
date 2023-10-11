package service;
/*
 clase CuentaLimite
Clase que hereda Cuenta. Incorporará un atributo "limite", para limitar la extracción a dicho valor.
Dispondrá también de un método ajustarLimite(), que fijará el límite en la mitad del saldo
 */


public class CuentaLimite extends Cuenta {
	private double limite;

	public CuentaLimite(String codigoCuenta, double saldo, double limite) {
		super(codigoCuenta, saldo);
		this.limite = limite;
	}
	public void ajustarLimite() {
		limite=getSaldo()/2;
	}
	
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}
	
}