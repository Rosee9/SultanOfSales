import java.util.ArrayList;

public class Kunde {

	private String name, email;
	private Adresse adresse;
	private int bezahlmethode, kundennummer,telefon;
	private static ArrayList<Kunde> kunden = new ArrayList<Kunde>();

	public Kunde(String name, String email, int telefon, int bezahlmethode, Adresse adresse) {
		this.name = name;
		this.email = email;
		this.telefon = telefon;
		this.adresse = adresse;
		this.bezahlmethode = bezahlmethode;
		kundenCheck(this);

	}

	public void kundenCheck(Kunde kunde) {

		boolean prüfen = true;

		for (Kunde einzelnerKunde : kunden) {
			if (kunde.kundennummer == einzelnerKunde.kundennummer) {
				prüfen = false;
			}
		}
		if (prüfen) {
			kunden.add(kunde);
		}
	}

	public void kundelöschen(int kundenummer) {

		for (Kunde einzelnerKunde : kunden) {
			if (kundennummer == einzelnerKunde.kundennummer) {
				kunden.remove(einzelnerKunde);
			}
		}

	}


	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getBezahlmethode() {
		return bezahlmethode;
	}

	public void setBezahlmethode(int bezahlmethode) {
		this.bezahlmethode = bezahlmethode;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	public static ArrayList<Kunde> getKunden() {
		return kunden;
	}

}
