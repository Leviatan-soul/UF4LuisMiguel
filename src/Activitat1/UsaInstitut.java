package Activitat1;

public class UsaInstitut {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Institut primero=new Institut("Jaume Huguet");
		Institut segundo=new Institut("Coster de la torre",700);
		
		
		Alumne Joan =new Alumne("joan",27,"422222A","joan@gmail.com");
		Alumne Isaac =new Alumne("Isaac",18,"43333333A","isac@gmail.com");
		Alumne Newton =new Alumne("Newton",140,"45555A","newton@gmail.com");
		Alumne Leviatan =new Alumne("Levitan",2300,"4456456Z","leviatan@gmail.com");
		Alumne Saiko =new Alumne("Saiko",18,"34435543A","saiko@gmail.com");
		Alumne David =new Alumne("David",18,"fsfs","David@gmail.com");
		
		
		
		primero.afegirAlumne(David);
		primero.afegirAlumne(Joan);
		primero.afegirAlumne(Isaac);
		segundo.afegirAlumne(Newton);
		segundo.afegirAlumne(Leviatan);
		segundo.afegirAlumne(Saiko);
		
		System.out.println("Primer Institut");
		for(int i=0;i<3;i++) {
		
			System.out.println(primero.getLlistaAlumne()[i].getName());
			
		}
		System.out.println("-----------------------");
		System.out.println("Segundo Institut");
		for(int i=0;i<3;i++) {
			
			
			System.out.println(segundo.getLlistaAlumne()[i].getName());
			
		}
		
		
		
		
		
		
		
		
		
	}

}
