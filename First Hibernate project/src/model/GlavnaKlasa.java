package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import biznisServis.crudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Scanner scanner = new Scanner(System.in);
	
	//System.out.println("Unesite naziv marke: ");
	//String nazivMarke = scanner.nextLine();
	
	/*System.out.println("Unesite ime zemlje: ");
	String zemlja=scanner.nextLine();
	
	System.out.println("Unesite ime grada: ");
	String grad = scanner.nextLine();
	
	System.out.println("Unesite ulicu");
	String ulica = scanner.nextLine();
	*/
	
	
	//int idMarke = Integer.parseInt(scanner.nextLine());
	
	
	
	crudMetode metode = new crudMetode();
	
	//metode.azurirajZemlju(idMarke, zemlja);
	
	//metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);
	

/*metode.ubaciMarku("Moskvic","SSSR","Moskva","KGB");

List<Adresa>listaAdresa = new ArrayList<Adresa>();

Adresa adresa1 = new Adresa();

adresa1.setZemlja("Srbija");
adresa1.setGrad("Beograd");
adresa1.setUlica("Knez Mihajlova");

listaAdresa.add(adresa1);

Adresa adresa2 = new Adresa();

adresa2.setZemlja("Srbija");
adresa2.setGrad("Zajecar");
adresa2.setUlica("Njegoseva");

listaAdresa.add(adresa2);



metode.ubaciUsera("Pera","Peric", listaAdresa);

*/

 SessionFactory sf = new Configuration().configure().buildSessionFactory();

/*List<Adresa>listaAdresa = new ArrayList<Adresa>();
List<Marka>marke = new ArrayList<Marka>();
List<User>listaUsera=new ArrayList<User>();
User user = new User();
User user2 = new User();
User user3 = new User();
Marka marka = new Marka();

Marka marka2 = new Marka();

Adresa adresa = new Adresa();


adresa.setZemlja("Srbija");
adresa.setGrad("Beograd");
adresa.setUlica("Moja ulica");

marka.setNazivMarke("Ferari");
marka.setAdresa(adresa);
listaUsera.add(user);
listaUsera.add(user2);
marka.setListaUsera(listaUsera);

marka2.setNazivMarke("Lamborgini");
marka2.setAdresa(adresa);
listaUsera.add(user);
listaUsera.add(user3);
*/


/*user.setIme("Pera");
user.setPrezime("Peric");
listaAdresa.add(adresa);
user.setListaAdresa(listaAdresa);

marke.add(marka);
marke.add(marka2);

user.setMarke(marke);


user3.setIme("Novak");
user3.setPrezime("Novakovic");
listaAdresa.add(adresa);
user3.setListaAdresa(listaAdresa);


marke.add(marka2);

user3.setMarke(marke);




*/

 
 
 User user = new User();
 Administrator administrator = new Administrator();
 Operator operator = new Operator();
 

Session sesija = sf.openSession();
sesija.beginTransaction();

try {
/*	sesija.save(user);
	sesija.save(user2);
	sesija.save(user3);
	sesija.save(marka);
	sesija.save(marka2);
	sesija.getTransaction().commit()*/;
} catch (Exception e) {
	sesija.getTransaction().rollback();
}finally {
	sesija.close();
}























}
}	
