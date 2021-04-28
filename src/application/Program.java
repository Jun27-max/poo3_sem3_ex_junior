package application;

import entities.Departament;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker worker1 = new Worker("Carlos", 234657, 35, new Departament("RH", 12));
		Worker worker2 = new Worker("Josue", 234657, 35, new Departament("RH", 12));

		if (worker1.getAge() > worker2.getAge()) {
			System.out.println("O colaborador mais velho é o: ");
			System.out.println(worker1.compareAge(worker2));
		} else if (worker1.getAge() == worker2.getAge()) {
			System.out.println("Os colaboradores que possuem a mesma idade são: ");
			System.out.println(worker1.compareAge(worker2));
			System.out.println(worker2.compareAge(worker1));
		} else {
			System.out.println("O colaborador mais velho é o: ");
			System.out.println(worker1.compareAge(worker2));
		}

		System.out.println("Existem Colaboradores com mesmos nomes no mesmo departamento? " + worker1.contem(worker2));

	}

}
