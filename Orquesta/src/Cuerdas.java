
public class Cuerdas {

	public String nombre;
	public String instrumento;
	public int edad;
	
	
	public Cuerdas(String nombre, String instrumento, int edad) {
		
		this.nombre = nombre;
		this.instrumento = instrumento;
		this.edad = edad;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getInstrumento() {
		return instrumento;
	}

	public int getEdad() {
		return edad;
	}
	
	public void interpretar() {
		System.out.println("El músico ha interpretado una pieza");
	}
	
	public void tocar() {
		System.out.println("El músico ha tocado su instrumento");
	}
	
	public void leerpieza() {
		System.out.println("El músico esta leyendo su partitura");
	}
	
}
