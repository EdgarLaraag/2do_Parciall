
public class Fagotist extends Metales implements tempo {

	private String rol;
	public instrumentdimen fagot;
	public Metal fagot1;
	
	public Fagotist(String nombre, String instrumento, int edad, String rol, instrumentdimen fagot, Metal fagot1) {
		
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.fagot = fagot;
	    this.fagot1 = fagot1;
	
}
	
	public String getRol() {
		return rol;
	}

		public void tocar () {
		System.out.println ("El fagotist ha comenzado a tocar su fagot");
	
	}
	
	public void leerpieza() {
		System.out.println ("El fagotist ha comenzado a leer su partitura");
	}
	public int tiempo(int bpm) {
		bpm = 85;
		return bpm;
	}


}
