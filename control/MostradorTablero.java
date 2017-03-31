package control;

import modelo.Casilla;
import modelo.Tablero;

public class MostradorTablero {

	
	public void imprimir(Tablero tablero){
		Casilla[][] casilla=tablero.getCasillas();
		for (int i = 0; i < casilla.length; i++) {
			for (int j = 0; j < casilla[0].length; j++) {
				System.out.print(casilla[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		
	}
}
