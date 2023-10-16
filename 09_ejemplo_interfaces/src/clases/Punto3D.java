package clases;

import interfaces.Operaciones;

public class Punto3D extends Punto implements Operaciones {
	private int z;
	public Punto3D(int z) {
		//super();no lo vemos pero está
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	/*@Override
	public void dibujar() {
		System.out.println("Ver las 3 Cordenadas: "+getX()+","+getY()+","+getZ());
	}*/
	// esto se puede hacer automáticamente, boton dch, source, override
	@Override
	public void dibujar() {		
		super.dibujar();  // llama a dibujar() de Punto
		System.out.println(","+getZ());
	}
	@Override
	public void girar(int grados) {
		setX(getX()+grados);
		
	}
	@Override
	public int invertir() {
		z-=10;
		return z;
	}
	
	
}
