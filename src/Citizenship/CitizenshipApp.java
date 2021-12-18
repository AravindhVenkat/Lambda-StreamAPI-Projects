package Citizenship;

import java.util.ArrayList;

public class CitizenshipApp {
	
	public static void main(String[] args) {
		
		//passing null in Category
		CitizenshipService.addPersonAndSetCategory(new Person(101,"Aravi",22,null));
		CitizenshipService.addPersonAndSetCategory(new Person(121,"Bala",46,null));
		CitizenshipService.addPersonAndSetCategory(new Person(165,"Deepak",76,null));
		CitizenshipService.addPersonAndSetCategory(new Person(501,"Ajay",34,null));
		
		ArrayList<Person> al =new ArrayList<>(CitizenshipService.hm.values());
		
		System.out.println("ID deleted?---->"+CitizenshipService.deletePersonById(121)+"\n");	//boolean
		System.out.println("Citizen List of given category: "+CitizenshipService.showPersonDetailsByCategory("Young")+"\n"); //List of Citizen with specified Category
		System.out.println("Number of Citizen aged above 35: "+CitizenshipService.countPersonAbove35(al)+"\n");
		System.out.println("Citizen List sorted by Age Ascending: "+CitizenshipService.sortPersonOnAgeAsc(al)+"\n");
		System.out.println("Citizen List sorted by Age Descending: "+CitizenshipService.sortPersonOnAgeDesc(al));
	}
}
