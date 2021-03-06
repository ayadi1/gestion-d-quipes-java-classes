package gestionEquipesEffTDI;

import java.util.ArrayList;
import java.util.List;

public class ListeInformaticiens {
	List<Informaticien> listeInfo = new ArrayList<Informaticien>();

	// ########################### methods ###################
	// #######################################################

	public void ajouter_informaticien(Informaticien info) {
		this.listeInfo.add(info);
	}
	
	public Informaticien trouver_informaticien(String CIN) {
		for (Informaticien informaticien : listeInfo) {
			if(informaticien.getCIN() == CIN) {
				return informaticien;
			}
		}
		return null;
	}
}
