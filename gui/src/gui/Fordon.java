package gui;

//Konstruktor för att skapa fordon med person, märke, registreringsnummer och typ av fordon
//post: returnerar en sträng med samtliga data

public class Fordon {
	private String fordontyp;
	private String brand;
	private String RegNR;
	private Person owner;

	public Fordon(String fordontypIn, String brandIn, String regnrIn, Person ownerIn) {		//konstruktor
		owner=ownerIn;
		brand=brandIn;
		RegNR=regnrIn;
		fordontyp=fordontypIn;
	}
	
	public void setFordontyp(String fordontypIn) {
		fordontyp=fordontypIn;
	}
	public void setBrand(String brandIn) {
		brand=brandIn;
	}
	public void setRegNR(String regnrIn) {
		RegNR=regnrIn;
	}
	public String getFordontyp(){
		return fordontyp;
	}
	public String getBrand(){
		return brand;
	}
	public String getRegNR(){
		return RegNR;
	}
	public String getAllt(){
		return owner.getName()+" "+owner.getAge()+" "+this.brand+" "+this.RegNR+" "+this.fordontyp+" ";
	}

}
