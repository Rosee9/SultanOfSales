package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Kunde.Kunde;

public class DB {
	
	

	public static void main(String[] args) {

		Connection verbindung = null;

		String url = "jdbc:mysql://3.69.96.96:3306/";
		String dbName = "db3";
		String userName = "db3";
		String driver = "com.mysql.cj.jdbc.Driver";
		String password = "!db3.winf22?";

		try {
			Class.forName(driver);
			verbindung = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database!\n");

			Statement abfrageAnweisung = verbindung.createStatement();
			ResultSet ergebnis;
			ergebnis = abfrageAnweisung.executeQuery(
					"SELECT KundenNummer, Name, Email, Telefon, Straﬂe, Nr, Ort, Geburtstag,plz, BezahlOption FROM kunden");


			while (ergebnis.next()) {

				int kundenNummer = ergebnis.getInt("KundenNummer");
				String name = ergebnis.getString("Name");
				String e_Mail = ergebnis.getString("Email");
				int telefon = ergebnis.getInt("Telefon");
				String straﬂe = ergebnis.getString("Straﬂe");
				int nr = ergebnis.getInt("Nr");
				String ort = ergebnis.getString("Ort");
				String geburtstag = ergebnis.getString("Geburtstag");
				int plz = ergebnis.getInt("plz");
				String bezahlmethode = ergebnis.getString("BezahlOption");
				int bezahlmethodeInt = 0;
				
				if(bezahlmethode.equals("Paypal")) {
					bezahlmethodeInt =1;
				}else if(bezahlmethode.equals("Rechnung")) {
					bezahlmethodeInt=2;
				}else if(bezahlmethode.equals("Lastschrift")) {
					bezahlmethodeInt=3;
				}
				
				Kunde kunde = new Kunde(name, e_Mail , telefon, bezahlmethodeInt, new Adresse(straﬂe, ort, plz, nr));

				System.out.println("KundenNummer." + kundenNummer + " Name: " + name + ", Email: " + e_Mail
						+ ", Telefon" + telefon + ", straﬂe " + straﬂe + " " + nr + ", plz" + plz + ", geburtstag : "
						+ geburtstag + ", bezahlmethode " + bezahlmethodeInt);
			}

			verbindung.close();
			System.out.println("\nDisconnected from database!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fehler bei der Verbindung!");
		}
	}

}
