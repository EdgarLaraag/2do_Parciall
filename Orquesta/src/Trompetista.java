
public class Trompetista extends Metales implements Stop {

	private String rol;
	public instrumentdimen trompeta;
	public Metal trompeta1;
	
	public Trompetista(String nombre, String instrumento, int edad, String rol, instrumentdimen trompeta, Metal trompeta1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.trompeta = trompeta;
	    this.trompeta1 = trompeta1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El trompetista ha comenzado a tocar su trompeta");
	
	}
	
	public void leerpieza() {
		System.out.println ("El trompetista ha comenzado a leer su partitura");
	}
	public void silencio() {
		System.out.println ("El trompetista se ha detenido");

}
}
