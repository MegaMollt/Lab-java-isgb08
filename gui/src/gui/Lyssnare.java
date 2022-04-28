package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Lyssnare extends WindowAdapter implements ActionListener {
	private GUI g; 
	Fordonsregister fordonsregister = new Fordonsregister();

	public Lyssnare(GUI gIn) {
	g=gIn;
	}
	public void actionPerformed(ActionEvent e) {
			
			

				String namn, type, brand, registrationNr, age;
				int age1;
	       		namn = g.getPersonName();
	       		age = g.getPersonAge();
	       		age1 = Integer.parseInt(age);
	       		type = g.getVehicleType();
	       		registrationNr = g.getVehicleRegistrationNumber();
	       		brand = g.getVehicleBrand();
	    	    //g.printRegistry(namn + " " + age + " " + type + " "+ registrationNr + " " + brand + "\n");
	    	      
	    	    if (fordonsregister.size()<fordonsregister.maxSize()) {
					Person owner = new Person(namn, age1);		//kallar på konstruktor och skapar person
					fordonsregister.add(registrationNr, brand, type, owner);		//adderar
					}

				for (int pos = 0; pos<(fordonsregister.size()); pos++){ 
					g.printRegistry(fordonsregister.skrivUt(pos).getAllt());
					}



	    }
	public void windowClosing (WindowEvent e) {
	        System.out.println("Hej då");
	System.exit(1);
	    }
}
