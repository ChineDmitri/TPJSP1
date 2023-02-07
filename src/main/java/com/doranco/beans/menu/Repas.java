package com.doranco.beans.menu;

public abstract class Repas {
	private String nom;

	public Repas(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
