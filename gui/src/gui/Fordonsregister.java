package gui;

import java.util.ArrayList;

public class Fordonsregister { //Aggregatförhållande till Fordon
	
	private int maxSize=10;				// Max antal platser i vektorn, 10 ger platserna 0-9.
	private ArrayList<Fordon> cars;		// Skapar en ArrayList med tidigare definierade max antal platser.
		
		
		
		public Fordonsregister() {		//konstruktor
			cars=new ArrayList<Fordon>(maxSize);
		}

		// pre: Uppgifter för person och fordon korrekt ifyllt, register ej fullt. 
		// post: Fordonet tillagt i registret 
		public void add(String regnr, String brand, String fordontyp, Person owner) {
			Fordon bil= new Fordon(regnr, brand, fordontyp, owner);
				cars.add(bil);
		}
		
		// pre: Anger en befintlig position i vektorn
		// post: Fordonsuppgifter tas bort ur registret för valt position
		public void remove(int pos) {
			cars.remove(pos);
								
		}
		
		// pre: Anger en befintlig position i vektorn
		// post: Fordonsuppgifter visas ur registret för vald position
		public Fordon getFordon(int pos) {
			return cars.get(pos);
		}
		
		// post: Returnerar storleken på befintlig vektor
		public int size() {
			return cars.size();
		}
		
		// post: Returnerar antal möjliga platser för vektor
		public int maxSize() {
			return this.maxSize;
		}
		
	// post: Returnerar information för samtliga vektorplatsen i for-loopen
		public Fordon skrivUt(int pos) {
			return cars.get(pos);
		}
}
