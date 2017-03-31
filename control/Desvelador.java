package control;

import modelo.Casilla;
import modelo.Tablero;

public class Desvelador {
	private Tablero tablero;
	private Casilla[][] casillas;

	public Desvelador(Tablero tablero) {
		super();
		this.tablero = tablero;
		this.casillas = tablero.getCasillas();
	}

	public void desvelarCasilla(int fila, int columna) {
		Casilla casilla = casillas[fila][columna];
		casilla.setVelada(false);
		if (casilla.getMinaAlrededor() == 0 && !casilla.isMinada()) {
			for (int i = fila - 1; i <= fila + 1; i++) {
				for (int j = columna - 1; j <= columna + 1; j++) {
					if (!(fila == i && columna == j)) {
						if (dentroDeLimites(i, j)) {
							Casilla cc = casillas[i][j];
							if (cc.isVelada()) {
								desvelarCasilla(i, j);
							}
						}
					}
				}

			}

		}

	}

	private boolean dentroDeLimites(int fila, int columna) {
		if (fila < 0 || columna < 0 || fila > casillas.length - 1 || columna > casillas[0].length - 1) {
			return false;
		}
		return true;
	}

}
