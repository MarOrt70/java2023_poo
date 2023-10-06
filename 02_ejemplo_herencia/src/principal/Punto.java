package principal;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//si no hay constructor con() vacios dará error
	public Punto () {
		x=20;
		y=10;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void dibujar() {
		System.out.println("ver las Coordenadas: "+x+","+y);
	}
}
