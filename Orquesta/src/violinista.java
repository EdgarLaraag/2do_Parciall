
public class violinista extends Cuerdas implements tempo {

	private String rol;
	public instrumentdimen violin;
    public violin violin1;
	
	public violinista(String nombre, String instrumento, int edad, String rol, instrumentdimen violin, violin violin1) {
	
		super(nombre, instrumento, edad);
	    this.rol = rol;
	    this.violin = violin;
	    this.violin1 = violin1;
	
}
	
	public String getRol() {
		return rol;
	}
	
	public violin getViolin1() {
		return violin1;
	}
	
	public void interpretar () {
		System.out.println ("El violinista ha interpretado la pieza");
	}
	
	public void tocar () {
		System.out.println ("El violinista ha comenzado a tocar su violín");
	
	}
	
	public void leerpieza() {
		System.out.println ("El violinista ha comenzado a leer su partitura");
	}
	
	public int tiempo(int bpm) {
		bpm = 80;
		return bpm;
	}
}