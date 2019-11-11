
public class Sax extends viento implements Stop {

	private String rol;
	public instrumentdimen Sax;
	public Vientos Sax1;
	
	public Sax(String nombre, String instrumento, int edad, String rol, instrumentdimen Sax, Vientos Sax1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.Sax = Sax;
	    this.Sax1 = Sax1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El Sax ha comenzado a tocar su Sax");
	
	}
	
	public void leerpieza() {
		System.out.println ("El Sax ha comenzado a leer su partitura");
	}
	public void silencio() {
		System.out.println("El Sax se ha detenido");
	}
}
