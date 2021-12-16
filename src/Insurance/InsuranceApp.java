package Insurance;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceApp
{
	
	
	public static ArrayList<Insurance> getInsuranceDetailsByCostAscending(ArrayList<Insurance> l)
	{
		List<Insurance> li = l.stream().sorted((o1,o2)->o1.getPremiumPerYear()-o2.getPremiumPerYear()).collect(Collectors.toList());
		ArrayList<Insurance> arl= new ArrayList<Insurance>(li);
		return arl;
	}
	
	public static ArrayList<Insurance> getInsuranceDetailsByCostDescending(ArrayList<Insurance> l)
	{
		List<Insurance> li = l.stream().sorted((o1,o2)->o2.getPremiumPerYear()-o1.getPremiumPerYear()).collect(Collectors.toList());
		ArrayList<Insurance> arl= new ArrayList<Insurance>(li);
		return arl;
	}

	public static void main(String[] args) {
		Insurance i1=new Insurance("Health","Jeevan",17000);
		Insurance i2=new Insurance("Car","safeCar",13000);
		Insurance i3=new Insurance("Life","lifeInsur",14000);
		Insurance i4=new Insurance("Pet","petInsur",15000);
		Insurance i5=new Insurance("Health","LongLive",16000);
		
		ArrayList<Insurance>l = new ArrayList<Insurance>();

		l.add(i1);
		l.add(i2);
		l.add(i3);
		l.add(i4);
		l.add(i5);
		
		System.out.println("Low to High: "+getInsuranceDetailsByCostAscending(l)+"\n");
		System.out.println("High to Low: "+ getInsuranceDetailsByCostDescending(l));
	}

}