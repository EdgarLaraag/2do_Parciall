
public class Clarinetista extends Metales implements Solo {
	
	private String rol;
	public instrumentdimen clarinete;
	public Metal clarinete1;
	
	public Clarinetista(String nombre, String instrumento, int edad, String rol, instrumentdimen clarinete, Metal clarinete1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.clarinete = clarinete;
	    this.clarinete1 = clarinete1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El clarinetista ha comenzado a tocar su violín");
	
	}
	
	public void leerpieza() {
		System.out.println ("El clarinetista ha comenzado a leer su partitura");
	}
	public void Solear() {
		System.out.println ("El clarinetista ha comenzado a solear");

}

}
