package question2;

import java.util.Calendar;

public class DiverseClass {
	public static void main(String []args){
		Calendar cal=Calendar.getInstance();
		cal.set(2010, 2, 2);
		
		Calendar endTime=Calendar.getInstance();
		endTime.set(2014, 2, 2);
		
		Employee e=new Employee("java",18,"java²¿",cal,0);
		System.out.println(e.comSalary());
	
		Manager m=new Manager("java",18,"java²¿",cal,0,1);
		System.out.println(m.comSalary());
	
		Contractor c=new Contractor("java",18,"java²¿",cal,0,endTime);
		System.out.println(c.comSalary());
	
	}
}
