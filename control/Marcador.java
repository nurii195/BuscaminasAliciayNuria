package control;

import javax.swing.JButton;

import modelo.Casilla;
import modelo.Coordenada;
import modelo.Tablero;

public class Marcador {

	
	public  void marcarCasilla(JButton boton,Tablero tablero) {
		Coordenada coordenada=new Varios().obtenerCoordenada(boton);
		Casilla casillaActual=tablero.getCasilla(coordenada);
		if(casillaActual.isVelada()){
			casillaActual.setMarcada(!casillaActual.isMarcada());
			if(casillaActual.isMarcada()){
				boton.setText(coordenada.toString());
			}
			else{
				boton.setText("");
			}
		}
	}
}
