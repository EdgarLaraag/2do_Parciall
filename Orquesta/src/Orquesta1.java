
public class Orquesta1 implements Stop{

	public violinista elviolin;

	public chellista elcello;
	public Contrabajo elcontra;
	public Clarinetista elclari;
	public Trompetista eltromp;
	public Fagotist elfag;
	public Flauta laflauta;
	public Sax elsax;
	public Flautatransversal eltrans;
	
	public Orquesta1(violinista elviolin, chellista elcello, Contrabajo elcontra, Clarinetista elclari, Trompetista eltromp,
			Fagotist elfag, Flauta laflauta, Sax elsax, Flautatransversal eltrans) {
		this.elviolin = elviolin;
		this.elcello = elcello;
		this.elcontra = elcontra;
		this.elclari = elclari;
		this.eltromp = eltromp;
		this.elfag = elfag;
		this.laflauta = laflauta;
		this.elsax = elsax;
		this.eltrans = eltrans;
			
	}
	
	public violinista getElviolin() {
		return elviolin;
	}
	
	public chellista getElcello() {
		return elcello;
	}
	
	public Contrabajo getElcontra() {
		return elcontra;
	}
	
	public Clarinetista getElclari() {
		return elclari;
	}
	
	public Trompetista getEltromp() {
		return eltromp;
	}
	
	public Fagotist getElfag() {
		return elfag;
	}
	
	public Flauta getLaflauta() {
		return laflauta;
	
	}
	
	public Sax getElsax() {
		return elsax;
	}
	
	public Flautatransversal getEltrans(){
		return eltrans;
	}
	
	public void silencio() {
		System.out.println("La Orquesta ha finalizado la interpretación de la pieza");
	}
	
	public void iniciar() {
		System.out.println ("La Orquesta ha iniciado la interpretación de la pieza");
	}
}
