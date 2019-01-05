package ecole;

public class Directeur {
	private int code;
	private String nom;
	private String prenom;
	private String Fonction;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFonction() {
		return Fonction;
	}
	public void setFonction(String fonction) {
		this.Fonction = fonction;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Directeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Directeur(int code, String nom, String prenom, String fonction) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.Fonction = fonction;
	}
	

}
