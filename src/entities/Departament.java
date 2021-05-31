package entities;

public class Departament {

	private String nameDepartament;
	private int ramal;

	public Departament() {

	}

	public Departament(String nameDepartament, int ramal) {
		this.nameDepartament = nameDepartament;
		this.ramal = ramal;

	}

	public String getNameDepartament() {
		return nameDepartament;
	}

	public void setNameDepartament(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}

	public int getRamal() {
		return ramal;
	}
	
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public boolean compareName(Departament departament) {
		if(departament == null) {
			return false;
		}
		boolean nameEquals = departament.nameDepartament.equals(this.nameDepartament);
		boolean ramalEquals = departament.ramal == this.ramal;
		return nameEquals && ramalEquals;
	}

	@Override
	public String toString() {
		return String.format("nome: %S , ramal: %d", nameDepartament, ramal);
	}
	
	

}
