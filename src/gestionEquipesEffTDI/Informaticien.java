package gestionEquipesEffTDI;

import java.util.Date;

public class Informaticien {
	private String CIN;
	private String Nom_i;
	private String Prenom_i;
	private String profile;
	private double grade;
	private Date date_Embauche;

	// ##################### constructor #####################
	// #######################################################

	public Informaticien(String CIN,String nom_i, String prenom_i, String profile, double grade, Date date_Embauche) {
		this.CIN = CIN;
		Nom_i = nom_i;
		Prenom_i = prenom_i;
		this.profile = profile;
		this.grade = grade;
		this.date_Embauche = date_Embauche;
	}

	public Informaticien() {

	}
	// ######################## getters setters ##############
	// #######################################################
	
	public String getCIN() {
		return CIN;
	}

	public String getNom_i() {
		return Nom_i;
	}

	public void setNom_i(String nom_i) {
		Nom_i = nom_i;
	}

	public String getPrenom_i() {
		return Prenom_i;
	}

	public void setPrenom_i(String prenom_i) {
		Prenom_i = prenom_i;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		if (profile=="java"||profile==".net") {
			this.profile = profile;			
		}else {
			System.out.println("selectioner [java,.net]");
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Date getDate_Embauche() {
		return date_Embauche;
	}

	public void setDate_Embauche(Date date_Embauche) {
		this.date_Embauche = date_Embauche;
	}


	// ########################### methods ###################
	// #######################################################
	public double Salaire() {
		return this.grade*3000;
	}
	
	// ########################### toString ##################
	// #######################################################
	@Override
	public String toString() {
		return "Informaticien [CIN=" + CIN + ", Nom_i=" + Nom_i + ", Prenom_i=" + Prenom_i + ", profile=" + profile
				+ ", grade=" + grade + ", date_Embauche=" + date_Embauche + "]";
	}
	
	
	
}
