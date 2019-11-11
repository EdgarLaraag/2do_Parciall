
public class Flauta extends viento implements Solo{
 
	private String rol;
	public instrumentdimen flauta;
	public Vientos flauta1;
	
	public Flauta(String nombre, String instrumento, int edad, String rol, instrumentdimen flauta, Vientos flauta1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.flauta = flauta;
	    this.flauta1 = flauta1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El Falutista ha comenzado a tocar su Flauta");
	
	}
	
	public void leerpieza() {
		System.out.println ("El Flautista ha comenzado a leer su partitura");
	}
	public void Solear() {
		System.out.println("El Flautista ha comenzado a solear");
	}
}
