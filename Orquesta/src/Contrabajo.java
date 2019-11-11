
public class Contrabajo extends Cuerdas implements Stop {
	
	private String rol;
	public instrumentdimen chello;
    public violin violin2;
	
	public Contrabajo (String nombre, String instrumento, int edad, String rol, instrumentdimen chello, violin violin2) {
	
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.chello = chello;
	    this.violin2 = violin2;
	
}
	
	public String getRol() {
		return rol;
	}
	
	public void interpretar () {
		System.out.println ("El Contra ha interpretado la pieza");
	}
	
	public void tocar () {
		System.out.println ("El Contra ha comenzado a tocar su Contrabajo");
	
	}
	
	public void leerpieza() {
		System.out.println ("El Contra ha comenzado a leer su partitura");
	}
	
	public void silencio() {
		System.out.println("El Contra se ha detenido");
	

}
}
