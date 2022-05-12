package Aufträge;

import java.util.ArrayList;

import Kunde.Kunde;
import Rechner.Komponenten;
import Rechner.Rechner;

public class Aufträge{
	
	
	ArrayList<Komponenten> rechner;
	private String kunde;
	private int auftragsNummer;
	private String status;
	
	
	

	public Aufträge(ArrayList<Komponenten> rechner, Kunde kunde, int auftragsNummer, String status) {
		this.rechner=rechner;
		this.kunde = kunde.getname();
		this.auftragsNummer = auftragsNummer;
		this.status = status;
	}

	public String getKunde() {
		return kunde;
	}
	public void setKunde(String kunde) {
		this.kunde = kunde;
	}
	public int getAuftragsNummer() {
		return auftragsNummer;
	}
	public void setAuftragsNummer(int auftragsNummer) {
		this.auftragsNummer = auftragsNummer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
