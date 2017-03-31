package control;

import javax.swing.JButton;

import modelo.Coordenada;

public class Varios {
	// me extrar el nombre de los botones y estos seran las coordenadas retornadas

	public Coordenada obtenerCoordenada(JButton boton){
		String coordenada=boton.getName();
		String[] coord = coordenada.split("M");
		return new Coordenada(Integer.valueOf(coord[0]),Integer.valueOf(coord[1]));
	}
}
