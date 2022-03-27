package com.edu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employeedetails{
	int eid;
	String ename;
	float esal;
	String edeptname;
	public Employeedetails(int eid, String ename, float esal,String edeptname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edeptname = edeptname;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ",edeptname=" + edeptname + "]";
	}	
}
//sorting based on id
class MySortCompare implements Comparator<Employeedetails>
{
	@Override
	public int compare(Employeedetails o1,Employeedetails o2) {
		if(o1.eid>o2.eid)
		return 1;
		else if(o1.eid<o2.eid)
			return -1;
		else
			return 0;
		
	}
}
//sorting based on salary
class MySortComparesal implements Comparator<Employeedetails>
{
	@Override
	public int compare(Employeedetails o1,Employeedetails o2) {
		if(o1.esal>o2.esal)
		return 1;
		else if(o1.esal<o2.esal)
			return -1;
		else
			return 0;
		
	}
}

public class Employee{

	public static void main(String[] args) {
		Employeedetails e1=new Employeedetails(4203, "Gopi", 6543.2f,"Science");
		Employeedetails e2=new Employeedetails(4201, "Viji", 7543.2f,"English");
		Employeedetails e3=new Employeedetails(4206, "Gomu", 89321.2f,"Maths");
		Employeedetails e4=new Employeedetails(4205, "Kavi", 6785.8f, "Physics");
		
		ArrayList<Employeedetails> elist = new ArrayList<Employeedetails>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		System.out.println(elist);
		
		//before sorting
		
		//Iterator 
		Iterator<Employeedetails> eit=elist.iterator();
		while(eit.hasNext()) {
		Employeedetails eob=eit.next();
		System.out.println(eob.eid+" "+eob.ename+" "+eob.esal+ " "+eob.edeptname);
		}
		//after sorting
		Collections.sort(elist, new MySortCompare());
		Iterator<Employeedetails>elist1=elist.iterator();
		System.out.println("after sorting id");
		System.out.println("***********************");
		while(elist1.hasNext())
		{
			Employeedetails eob1=elist1.next();
			System.out.println(eob1.eid+" "+eob1.ename+" "+eob1.esal+ " "+eob1.edeptname);
			
		}
		Collections.sort(elist, new MySortComparesal());
		Iterator<Employeedetails>elist2=elist.iterator();
		System.out.println("after sorting sal");
		System.out.println("***************************");
		while(elist2.hasNext())
		{
			Employeedetails eob2=elist2.next();
			System.out.println(eob2.eid+" "+eob2.ename+" "+eob2.esal+ " "+eob2.edeptname);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

