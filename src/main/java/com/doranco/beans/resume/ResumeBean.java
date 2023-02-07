package com.doranco.beans.resume;

public class ResumeBean {
	private String genre;
	private String nom;
	private String entree;
	private String plat;
	private String desert;

	public ResumeBean(String genre, String nom, String entree, String plat,
			String desert) {
		this.nom = nom;
		this.genre = genre;
		this.entree = entree;
		this.plat = plat;
		this.desert = desert;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEntree() {
		return entree;
	}

	public void setEntree(String entree) {
		this.entree = entree;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
