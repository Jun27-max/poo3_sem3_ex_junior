package entities;

public class Worker {

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

//
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

	// Um metodo faria comparação de idades
	public boolean compareAge(Worker worker) {
		if (worker == null) {
			return false;
		}

		return this.age == worker.age;
	}

	// Um metodo ignorando as mesmas idades. Verifica o que tem maior idade.

	public Worker compareTo(Worker o) {
		if (o == null) {
			return this;
		}
		if (this.age > o.age) {
			return this;
		}
		return o;
	}

	public boolean sameName(Worker worker) {
		String name = this.name;
		if (!name.equals(worker.name)) {
			return false;
		}

		String nameW = worker.name;
		Departament dep = worker.departament;

		boolean nomeEquals = this.name.equals(nameW);
		boolean departamentosEquals = dep == null ? this.departament == null : dep.compareName(this.departament);
		return nomeEquals && departamentosEquals;
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
