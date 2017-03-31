package control;

import modelo.Casilla;
import modelo.Coordenada;
import modelo.Tablero;

public class ContadorMinas {
	private Casilla[][] casillas;

	public ContadorMinas(Tablero tablero) {
		super();
		this.casillas = tablero.getCasillas();
	}

	public void contarMinas() {
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				Casilla casillita = casillas[i][j];
				byte alrededorMinas = contarAlrededor(i, j);
				casillita.setMinaAlrededor(alrededorMinas);
			}

		}

	}

	private byte contarAlrededor(int fila, int columna) {
		byte contador = 0;
		for (int i = fila - 1; i <= fila + 1; i++) {
			for (int j = columna - 1; j <= columna + 1; j++) {
				if (!(fila == i && columna == j)) {
					if (dentroDeLimites(i, j)) {
						Casilla casilla = casillas[i][j];
						if (casilla.isMinada()) {
							contador++;

						}
					}
				}
			}

		}
		return contador;
	}

	private boolean dentroDeLimites(int fila, int columna) {
		if (fila<0 || columna<0 || fila>casillas.length-1 || columna>casillas[0].length-1) {
			return false;
		}
		return true;
	}
	

}
