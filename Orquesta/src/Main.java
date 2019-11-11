
public class Main {

	public static void main (String [] args) {
	 violinista objViolinista = new violinista("Edgar", "violin", 25, "solista", new instrumentdimen(0.75,0.40,"madera"), new violin("Yamaha", 400, "nylon"));
	 
     chellista objChellista = new chellista("Chuy", "cello", 31, "acompañante", new instrumentdimen(1.1,0.7,"madera"), new violin("Stradivarius", 700, "nylon"));
	 
     Contrabajo objContra = new Contrabajo("Lalo", "contrabajo", 27, "acompañante", new instrumentdimen(1.8,1.2,"madera"), new violin("Fender", 700, "nylon"));
	 

	 Clarinetista objClarinete = new Clarinetista("Fer", "Clarinete", 22, "solista", new instrumentdimen(0.5,0.15,"madera"), new Metal("Rolland", 800, "metal"));
	 
	 Trompetista objTrompetista = new Trompetista("Ramón", "Trompeta", 35, "acompañante", new instrumentdimen(0.6,0.20,"metal"), new Metal ("Yamaha", 1200, "metal"));
	 
	 Fagotist objFagotist = new Fagotist("Ramón", "Fagot", 32, "acompañante", new instrumentdimen(0.3,0.35,"metal"), new Metal ("Fender", 2000, "metal"));
	 

	 Flauta objFlauta = new Flauta("Peter", "Flauta", 21, "solista", new instrumentdimen(0.2,0.07,"viento"), new Vientos("yamaha", 500, "aire"));
	 
	 Sax objSax = new Sax("Javi", "Sax", 21, "solista", new instrumentdimen(0.4,0.2,"viento"), new Vientos("Rolland", 2500, "aire"));	
	 
	 Flautatransversal objFlautatransversal = new Flautatransversal("Luis", "Flautatransversal", 21, "solista", new instrumentdimen(0.4,0.1,"viento"), new Vientos("Rolland", 1200, "aire"));
	 
	 Orquesta1 objOrquesta = new Orquesta1(objViolinista, objChellista, objContra, objClarinete, objTrompetista, objFagotist, objFlauta, objSax, objFlautatransversal);
	 
	 objOrquesta.getElviolin().interpretar();
	 objOrquesta.getElcello().interpretar();
	 objOrquesta.getElcontra().interpretar();
	 objOrquesta.getElclari().tocar();
	 objOrquesta.getEltromp().tocar();
	 objOrquesta.getElfag().tocar();
	 objOrquesta.getLaflauta().tocar();
	 objOrquesta.getElsax().tocar();
	 objOrquesta.getEltrans().tocar();
	 objOrquesta.getElsax().silencio();
	 objOrquesta.getLaflauta().Solear();
	 objOrquesta.getElcello().silencio();
	 objOrquesta.getElclari().Solear();
	 objOrquesta.getElsax().tocar();
	 objOrquesta.getElcello().tocar();
	 objOrquesta.silencio();
	 
	 
	 
	 }
}

