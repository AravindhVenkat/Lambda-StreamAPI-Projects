package PersonAge;

import java.util.*;
public class PersonAgeApp
{
	//return the count of persons above the age specified
	public static int getPersonsAboveAge(int n, List<PersonAge> l)
	{	
		return (int) l.stream().filter(o->o.getAge()>n).count();
	}
			
	public static int getMaxAge(List<PersonAge> l) 
	{
		return l.stream().max((o1,o2)->o1.getAge()-o2.getAge()).get().getAge();
	}
	
	public static void getPersonsInAgeRange(int LowerAge, int upperAge, List<PersonAge> l)
	{
		l.stream().filter(o->o.getAge()>LowerAge && o.getAge()<upperAge).forEach(o->System.out.println("<"+o.getName()+">:<"+o.getAge()+">"));
	}
}