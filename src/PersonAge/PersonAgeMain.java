package PersonAge;

import java.util.*;

public class PersonAgeMain
{
	public static void main(String[] args) 
	{
		PersonAge p1 = new PersonAge("Aravi",23);
		PersonAge p2 = new PersonAge("Bravo",28);
		PersonAge p3 = new PersonAge("Charlie",29);
		PersonAge p4 = new PersonAge("Delta",36);
		PersonAge p5 = new PersonAge("Echo",65);
		
		List<PersonAge> al = Arrays.asList(p1,p2,p3,p4,p5);
		
		System.out.println("Oldest Age amongst all the persons is : "+PersonAgeApp.getMaxAge(al)+"\n");
		
		System.out.println("Number of Persons older than 28 is : "+ PersonAgeApp.getPersonsAboveAge(28, al)+"\n");
		
		System.out.println("Persons in given range:");
		PersonAgeApp.getPersonsInAgeRange(25,45,al);
	}
}
