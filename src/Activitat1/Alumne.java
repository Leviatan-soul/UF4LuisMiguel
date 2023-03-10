package Activitat1;

public  class Alumne {
	private String name;
	private int edat;
	private String dni;
	private String email;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getEdat() {
		return edat;
	}




	public void setEdat(int edat) {
		this.edat = edat;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Alumne(String nom,int edat, String dni,String email) {
		this.name=nom;
		this.edat=edat;
		this.dni=dni;
		this.email=email;
		
		
	}
	
	
	

}



