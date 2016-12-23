package question2;

import java.util.Calendar;
import java.util.Date;

public class Manager extends Employee {
	protected int bonus;
	public Manager(){
		super();
		bonus=0;
	}
	public Manager(String name,int age,String department,Calendar time,int basicSalary,int bonus){
		super(name,age,department,time,basicSalary);
		this.bonus=bonus;
	}
	public int comSalary(){
		Calendar currentTime=Calendar.getInstance();
		currentTime.setTime(new Date());
		return basicSalary+(currentTime.get(Calendar.YEAR)-time.get(Calendar.YEAR))*20+bonus;
	}
}
