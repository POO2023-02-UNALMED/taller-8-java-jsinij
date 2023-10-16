package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados=goles;
		this.dorsal=dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	
	@Override
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados );
	}

	public int compareTo(Futbolista o) {
		int x;
		if (this.getEdad()< o.getEdad()) {
			x=o.getEdad()-this.getEdad();
		}else {
			x=this.getEdad()-o.getEdad();
		}
		return (x);
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
