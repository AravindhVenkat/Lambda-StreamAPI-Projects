package Citizenship;

import java.util.ArrayList;

public class CitizenshipApp {
	
	public static void main(String[] args) {
		
		//passing null in Category
		Citizenship.addPersonAndSetCategory(new Person(101,"Aravi",22,null));
		Citizenship.addPersonAndSetCategory(new Person(121,"Bala",46,null));
		Citizenship.addPersonAndSetCategory(new Person(165,"Deepak",76,null));
		Citizenship.addPersonAndSetCategory(new Person(501,"Ajay",34,null));
		
		ArrayList<Person> al =new ArrayList<>(Citizenship.hm.values());
		
		System.out.println("ID deleted?---->"+Citizenship.deletePersonById(121)+"\n");	//boolean
		System.out.println("Citizen List of given category: "+Citizenship.showPersonDetailsByCategory("Young")+"\n"); //List of Citizen with specified Category
		System.out.println("Number of Citizen aged above 35: "+Citizenship.countPersonAbove35(al)+"\n");
		System.out.println("Citizen List sorted by Age Ascending: "+Citizenship.sortPersonOnAgeAsc(al)+"\n");
		System.out.println("Citizen List sorted by Age Descending: "+Citizenship.sortPersonOnAgeDesc(al));
	}
}
