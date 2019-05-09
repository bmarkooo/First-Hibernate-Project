package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class User {

	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String ime;
	private String prezime;
	
	
	@ElementCollection
	private List<Adresa>listaAdresa = new ArrayList<Adresa>();

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<Adresa> getListaAdresa() {
		return listaAdresa;
	}

	public void setListaAdresa(List<Adresa> listaAdresa) {
		this.listaAdresa = listaAdresa;
	}
	
	
	
	
	
}
