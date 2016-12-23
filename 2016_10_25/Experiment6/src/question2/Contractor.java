package question2;

import java.util.Calendar;

public class Contractor extends Employee {
	protected Calendar endTime;
	public Contractor(){
		super();
		endTime=null;
	}
	public Contractor(String name,int age,String department,Calendar time,int basicSalary,Calendar endTime){
		super(name,age,department,time,basicSalary);
		this.endTime=endTime;
	}
	public int comSalary(){
		return basicSalary+(endTime.get(Calendar.YEAR)-time.get(Calendar.YEAR))*15;
	}
}
