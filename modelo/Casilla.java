package modelo;

public class Casilla {
	private boolean velada = true;
	private boolean marcada = false;
	private boolean minada = false;
	private byte minaAlrededor = 0;

	public byte getMinaAlrededor() {
		return minaAlrededor;
	}

	public void setMinaAlrededor(byte minaAlrededor) {
		this.minaAlrededor = minaAlrededor;
	}

	public boolean isMinada() {
		return minada;
	}

	public void setMinada(boolean minada) {
		this.minada = minada;
	}

	public boolean isVelada() {
		return velada;
	}

	public void setVelada(boolean velada) {
		this.velada = velada;
	}

	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}

	@Override
	public String toString() {
		String resultado="*";
		if (isVelada()) {
			resultado="["+minaAlrededor+"]";
		}
		else{
			resultado=""+minaAlrededor;
		}
		if (isMinada()&&isVelada()) {
			resultado="[X]";
		}
		else if (isMinada()){
			resultado="X";
		}
		return resultado;
	}
}
