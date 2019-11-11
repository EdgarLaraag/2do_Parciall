
public class Flautatransversal extends viento implements tempo {
	
	private String rol;
	public instrumentdimen Flautatrans;
	public Vientos Flautatrans1;
	
	public Flautatransversal(String nombre, String instrumento, int edad, String rol, instrumentdimen Flautatrans, Vientos Flautatrans1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.Flautatrans = Flautatrans;
	    this.Flautatrans1 = Flautatrans1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El Falutatrans ha comenzado a sonar");
	
	}
	
	public void leerpieza() {
		System.out.println ("La Falutatrans ha comenzado a leer su partitura");
	}
	public int tiempo(int bpm) {
		bpm = 80;
		return bpm;
	}

}
