package com.doranco.beans.menu;

import java.util.Arrays;
import java.util.List;

public class Menu {

	private List<Entree> listEntree;
	private List<Plat> listPlat;
	private List<Desert> listDesert;

	public Menu() {
		listEntree = Arrays.asList(
				new Entree("Noix de St Jaques"),
				new Entree("Salade Césare")
				);
		setListPlat(Arrays.asList(
				new Plat("Risoto"), 
				new Plat("Cote de boeuf")
				));
		listDesert = Arrays.asList(
				new Desert("Glace"), 
				new Desert("Café gourmand")
				);
	}

	public Menu(List<Entree> listEntree, List<Plat> listPlat, List<Desert> listDesert) {
		this.listDesert = listDesert;
		this.setListPlat(listPlat);
		this.listDesert = listDesert;
	}

	public List<Entree> getListEntree() {
		return listEntree;
	}

	public void setListEntree(List<Entree> listEntree) {
		this.listEntree = listEntree;
	}

	public List<Plat> getListPlat() {
		return listPlat;
	}

	public void setListPlat(List<Plat> listPlat) {
		this.listPlat = listPlat;
	}

	public List<Desert> getListDesert() {
		return listDesert;
	}

	public void setListDesert(List<Desert> listDesert) {
		this.listDesert = listDesert;
	}
	
	
}
