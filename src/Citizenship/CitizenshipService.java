package Citizenship;

import java.util.*;
import java.util.stream.Collectors;
public class CitizenshipService {
	
		static HashMap<Integer,Person> hm = new HashMap<>();
		
		//pre-populated values		
		public CitizenshipService() {
			Person p1 = new Person(101,"Poseidon",23,"Young");
			Person p2 = new Person(102,"Ares",12,"Child");
			Person p3 = new Person(103,"Hades",43,"Adult");
			Person p4 = new Person(104,"Zeus",73,"Old");

			hm.put(p1.getId(), p1);
			hm.put(p2.getId(), p2);
			hm.put(p3.getId(), p3);
			hm.put(p4.getId(), p4);
		}
		
		public static void addPersonAndSetCategory(Person p) {		
			
			if(p.getAge()>0 && p.getAge()<=10) p.setCategory("Child");
			else if(p.getAge()>11 && p.getAge()<=18) p.setCategory("Adolescent");
			else if(p.getAge()>18 && p.getAge()<=25) p.setCategory("Young");
			else if(p.getAge()>25 && p.getAge()<=45) p.setCategory("Adult");
			else if(p.getAge()>45 && p.getAge()<=60) p.setCategory("Mid-Age");
			else if(p.getAge()>60) p.setCategory("Senior");
			
			hm.put(p.getId(), p);
			
		}
	
	  public static boolean deletePersonById(int id) { 
		  boolean b;
		  if(hm.remove(id)!=null)
		  {
			  b = true;
			  System.out.println(id+" - ID found and deleted successfully");
		  }			  
		  else
		  {
			  b = false;
			  System.out.println("Error 404: ID not found ");
		  } 
			  
		  return b;
	  }
		
		public static ArrayList<Person> showPersonDetailsByCategory(String category){
			return (ArrayList<Person>) hm.values().stream().filter(o->o.getCategory().equals(category)).collect(Collectors.toList());
		}
		
		public static int countPersonAbove35(ArrayList<Person> al) {
			return (int)al.stream().filter(o->o.getAge()>35).count();
		}
		
		public static List<Person> sortPersonOnAgeAsc(ArrayList<Person> al){
			return al.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).collect(Collectors.toList());
		}
		
		public static List<Person> sortPersonOnAgeDesc(ArrayList<Person> al){
			return al.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).collect(Collectors.toList());
		}
		
}
