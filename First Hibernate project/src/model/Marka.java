package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moja_tabela_marki")
public class Marka {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_marke")
	private int idMarke;
	@Column(name ="naziv_marke")
	private String nazivMarke;
	private String zemlja;
	public int getIdMarke() {
		return idMarke;
	}
	public void setIdMarke(int idMarke) {
		this.idMarke = idMarke;
	}
	public String getNazivMarke() {
		return nazivMarke;
	}
	public void setNazivMarke(String nazivMarke) {
		this.nazivMarke = nazivMarke;
	}
	public String getZemlja() {
		return zemlja;
	}
	public void setZemlja(String zemlja) {
		this.zemlja = zemlja;
	}
	
	
	
}
