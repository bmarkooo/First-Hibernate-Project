package model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import biznisServis.crudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Unesite idMarke: ");
	
	int idMarke = Integer.parseInt(scanner.nextLine());
	
	System.out.println("Unesite zemlju: ");
	
	String zemlja = scanner.nextLine();
	
	crudMetode metode = new crudMetode();
	
	metode.azurirajZemlju(idMarke, zemlja);
	
	
	





























}
}	
