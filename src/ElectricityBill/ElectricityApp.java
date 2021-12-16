package ElectricityBill;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class ElectricityApp {
	
	public static int getLowestBillAmt(ElectricityBill[]arr) 
	{		
		return Arrays.stream(arr).min((o1,o2)->o1.getBillAmt()-o2.getBillAmt()).get().getBillAmt();
	}
	
	public static ElectricityBill highestPaidBill(ElectricityBill[]arr)
	{		
		return Arrays.stream(arr).max((o1,o2)->o1.getBillAmt()-o2.getBillAmt()).get();
	}
	
	public static List<ElectricityBill> getAllBills(ElectricityBill[]arr)
	{
		return Arrays.stream(arr).filter(o->o.getBillAmt()>1001).collect(Collectors.toList());
	}
	
	static void displayAll(ElectricityBill[]arr) 
	{	
		Arrays.stream(arr).forEach(System.out::println);		
	}
	

	public static void main(String[] args)
	{		
		int n=5;
		ElectricityBill[]arr=new ElectricityBill[n];
		
		arr[0]=new ElectricityBill(12345,LocalDate.of(2021, 1, 21),1000);
		arr[1]=new ElectricityBill(19345,LocalDate.of(2021, 1, 14),1000);
		arr[2]=new ElectricityBill(12545,LocalDate.of(2021, 3, 21),2000);
		arr[3]=new ElectricityBill(12343,LocalDate.of(2021, 1, 21),2600);
		arr[4]=new ElectricityBill(12340,LocalDate.of(2021, 1, 21),1001);
		
			
		System.out.println("Lowest Bill Amount: "+getLowestBillAmt(arr));
		
		System.out.println("All Bills Amount Greater Than Rs.1001: "+getAllBills(arr));
		
		System.out.println("Bill with Highest Amount: "+highestPaidBill(arr));
		
		System.out.println("All Bills:");
		displayAll(arr);			
	}
}
