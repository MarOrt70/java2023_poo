package p2;

import p1.Uno;

public class Dos extends Uno {
		public void metodo() {
			a=3;//privada no
			b=5;//paquete no
			c=10; // así si la veo pq es directa de la herencia
			d=20;// igual
			Uno uno=new Uno();
			uno.d=40;// aquí estoy fuera de la herencia, solo veo d
			uno.c=6; // tampoco la veo
		}

}
