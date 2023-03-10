package Activitat1;

public class Institut {

	private String nom;
	private Alumne llistaAlumne[];
	private int contAlumne;
	private int  id;
	
	
	public Institut(String nombre){
		this.nom=nombre;
		this.llistaAlumne=new Alumne[100];
		this.contAlumne=0;
		
	}

	
	public Institut(String nombre,int max){
		this.llistaAlumne=new Alumne[max];
		this.nom=nombre;
		this.contAlumne=0;
	
	}



	public void afegirAlumne(Alumne x) {
		this.llistaAlumne[contAlumne]=x;
		this.contAlumne++;
	}


	public Alumne[] getLlistaAlumne() {
		return this.llistaAlumne;
	}


	public void setLlistaAlumne(Alumne[] llistaAlumne) {
		this.llistaAlumne = llistaAlumne;
	}




	
	
}
