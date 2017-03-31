package control;

import modelo.Casilla;
import modelo.Coordenada;
import modelo.Tablero;

public class Minador {
	private Tablero tablero;

	public Minador(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public void minar(int minas) {
		int contador = 0;
		Casilla[][] tablerito = tablero.getCasillas();
		while (contador < minas) {
			int fila = (int) (Math.random() * tablerito.length);
			int columna = (int) (Math.random() * tablerito[0].length);
			Casilla casillita = tablerito[fila][columna];
			if (!casillita.isMinada()) {
				casillita.setMinada(true);
				contador++;

			}

		}
	}

}
