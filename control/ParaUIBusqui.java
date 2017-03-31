package control;

import modelo.Coordenada;
import modelo.Tablero;
import vista.UIbusqui;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class ParaUIBusqui extends UIbusqui {

	private Tablero tablero;
	private Marcador marcador = new Marcador();
	Desvelador des = new Desvelador(tablero);

	public ParaUIBusqui() {

		crearBotones(4, 5);
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			marcador.marcarCasilla((JButton) e.getSource(), tablero);

		}
	};

	public void crearBotones(int ancho, int alto) {
		tablero = new Tablero(ancho, alto);
		botonera.setLayout(new GridLayout(0, ancho, 0, 0));

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				JButton btnNewButton = new JButton("");
				btnNewButton.addActionListener(listener);
				btnNewButton.setName(i+"M"+j);				
				botonera.add(btnNewButton);
				
			}

		}
		
		//me pone las minas y las cuenta
		Minador minador = new Minador(tablero);
		minador.minar(4);

		ContadorMinas contadorMinas = new ContadorMinas(tablero);
		contadorMinas.contarMinas();
		//----------------------------
		
		MostradorTablero mostrador = new MostradorTablero();
		mostrador.imprimir(tablero);
		
		
		des.desvelarCasilla(0, 0);
		
		System.out.println("---------------------------------------");
		
		mostrador.imprimir(tablero);
		
	}
	 

}