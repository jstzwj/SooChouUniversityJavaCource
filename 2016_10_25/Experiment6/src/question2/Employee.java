package question2;

import java.util.Calendar;
import java.util.Date;

public class Employee {
	protected String name;
	protected int age;
	protected String department;
	protected Calendar time; 
	protected int basicSalary;
	public Employee(){
		name="";
		age=0;
		department="";
		time=null;
		basicSalary=0;
	}
	public Employee(String name,int age,String department,Calendar time,int basicSalary){
		this.name=name;
		this.age=age;
		this.department=department;
		this.time=time;
		this.basicSalary=basicSalary;
	}
	public int comSalary(){
		Calendar currentTime=Calendar.getInstance();
		currentTime.setTime(new Date());
		return basicSalary+(currentTime.get(Calendar.YEAR)-time.get(Calendar.YEAR))*20;
	}
}
