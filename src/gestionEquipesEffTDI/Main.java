package gestionEquipesEffTDI;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Informaticien oussama = new Informaticien("f1234","ayadi","oussama","java",1.2,new Date());
		Informaticien ahmed = new Informaticien("f1235","ajjalti","ahmed",".net",2.2,new Date());
		Informaticien kouther = new Informaticien("f1236","boujdadi","kouther","java",3.2,new Date());
		
		ListeInformaticiens l = new ListeInformaticiens();
		l.ajouter_informaticien(oussama);
		l.ajouter_informaticien(ahmed);
		l.ajouter_informaticien(kouther);
		
		System.out.println(l.trouver_informaticien("f1237"));
	
	}
}
