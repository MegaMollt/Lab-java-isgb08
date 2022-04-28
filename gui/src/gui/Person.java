package gui;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String nameIn, Integer ageIn){			//konstruktor
		name=nameIn;
		age=ageIn;
	}
		
	public void setName(String nameIn){
		name=nameIn;
		}
	
	public void setAge(int ageIn){
		age=ageIn;
		}
			
	public int getAge(){
		return age;
		}
			
	public String getName(){
		return name;
		}

}

