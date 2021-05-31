package application;

import entities.Departament;
import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TI
		Worker worker1 = new Worker("Carlos", 234657, 35, new Departament("TI", 12));
		Worker worker2 = new Worker("Josue", 234658, 38, new Departament("TI", 62));
		Worker worker3 = new Worker("Fátima", 234659, 37, new Departament("TI", 32));
		Worker worker4 = new Worker("Maria", 234610, 33, new Departament("TI", 42));
		                                                                  
		//RH
		Worker worker5 = new Worker("Carlos", 234111, 33, new Departament("RH", 72));
		Worker worker6 = new Worker("Maria", 2346112, 32, new Departament("RH", 22));
		Worker worker7 = new Worker("Miguel", 234623423, 25, new Departament("RH", 32));
		Worker worker8 = new Worker("Romualdo", 234657, 45, new Departament("RH", 13));
		
		//Finanças
		Worker worker9 = new Worker("José", 234623545, 25, new Departament("Finanças", 13));
		Worker worker10 = new Worker("Franco", 23465756, 35, new Departament("Finanças", 22));
		Worker worker11 = new Worker("Manoel", 238678677, 75, new Departament("Finanças", 42));
		Worker worker12 = new Worker("Jesse", 25675677, 95, new Departament("Finanças", 19));
		
		System.out.println(worker11.compareAge(worker12));
		System.out.println(worker10.compareAge(worker1));
		System.out.println(worker8.compareAge(worker9));
		System.out.println(worker7.compareAge(worker3));
		System.out.println(worker6.compareAge(worker12));
		System.out.println(worker5.compareAge(worker12));
		System.out.println(worker4.compareAge(worker2));
	}

}
