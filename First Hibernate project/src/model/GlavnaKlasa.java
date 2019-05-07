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
	
	System.out.println("Unesite naziv marke: ");
	String nazivMarke = scanner.nextLine();
	
	System.out.println("Unesite ime zemlje: ");
	String zemlja=scanner.nextLine();
	
	System.out.println("Unesite ime grada: ");
	String grad = scanner.nextLine();
	
	System.out.println("Unesite ulicu");
	String ulica = scanner.nextLine();
	
	
	
	//int idMarke = Integer.parseInt(scanner.nextLine());
	
	
	
	crudMetode metode = new crudMetode();
	
	//metode.azurirajZemlju(idMarke, zemlja);
	
	metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);
	





























}
}	
