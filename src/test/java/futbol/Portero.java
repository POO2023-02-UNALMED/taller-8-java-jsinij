package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos=goles;
		this.dorsal=dorsal;
	}
	
	public Portero() {
		this("Juan", 24,(short)15,(byte) 1);
	}
	
	@Override
	public String toString() {
		return ("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos);
	}
	
	@Override
	public int compareTo(Portero o) {
		int dif;
		if (this.golesRecibidos<o.golesRecibidos) {
			dif = o.golesRecibidos - this.golesRecibidos;
		}else {
			dif =this.golesRecibidos - o.golesRecibidos;
		}
		return (dif);
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
