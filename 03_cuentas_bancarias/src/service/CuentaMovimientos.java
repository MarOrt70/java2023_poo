package service;
import java.time.LocalDateTime;
/* Clase CuentaMovimientos
Clase que hereda CuentaLimite. Incorpora un nuevo método obtenerMovimientos que devolverá un ArraList con los movimientos realizados
en la cuenta. Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)
 */

import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite {
	ArrayList<Movimiento> movimientos=new ArrayList<>();

	public CuentaMovimientos(String codigoCuenta, double saldo, double limite) {
		super(codigoCuenta, saldo, limite);
	}
	
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}

	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),"extracción"));
		super.extraer(cantidad);
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),"ingreso"));
		super.ingresar(cantidad);
	}
	
	
}