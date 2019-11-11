
public class Vientos{
	
	public String marca;
	public int precio;
	public String tipo;
	
	public Vientos(String marca, int precio, String tipo) {
		
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public String getTipo() {
		return tipo;
	}

}
