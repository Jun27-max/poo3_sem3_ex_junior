package entities;

public class Worker implements Comparable<Worker> {

	private String name;
	private int cpf;
	private int age;

	private Departament departament;

	public Worker() {

	}

	public Worker(String name, int cpf, int age, Departament departament) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public int getAge() {
		return age;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public Worker compareAge(Worker worker) {
		if(this.compareTo(worker) == 1) {
			 return this;
		} else if (this.compareTo(worker) == 0) {
			return worker;
		}
		 return worker;
	}

	public int compareTo(Worker o) {
		if (this.age > o.age) {
			return 1;
		}
		return 0;
	}

	public boolean contem(Worker worker) {
		String name = this.name;
		if (!name.equals(worker.name)) {
			return true;
		}

		if (this.departament == worker.departament) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\n");
		sb.append(" Nome: ");
		sb.append(name);
		sb.append(" - ");
		sb.append(" CPF: ");
		sb.append(cpf);
		sb.append(" - ");
		sb.append(" Idade: ");
		sb.append(age);
		sb.append(" - ");
		sb.append("Departamento: ");
		sb.append(departament.getNameDepartament());
		sb.append(" - ");
		sb.append("Ramal: ");
		sb.append(departament.getRamal() + "\n");

		return sb.toString();
	}

}
