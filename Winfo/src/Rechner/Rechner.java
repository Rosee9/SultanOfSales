package Rechner;

import java.util.ArrayList;

public class Rechner {

	public ArrayList<Komponenten> rechner = new ArrayList<>();

	public Rechner(Komponenten... rechner) {

		for (Komponenten komponent : rechner) {
			this.rechner.add(komponent);
		}

	}

}
