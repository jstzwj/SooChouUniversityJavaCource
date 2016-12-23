package question3;

import test.accessTest;

public class SavingAccount {
	static double rate=0.0;
	private double money;
	public SavingAccount(){
		money=0.0;
	}
	public SavingAccount(double money){
		this.money=money;
	}
	public double getMoney(){
		return money;
	}
	public double getMonthRate(){
		return getYearRate()/12;
	}
	public double getYearRate(){
		return (1+rate)*money;
	}
	public static void main(String []args){
		SavingAccount acc=new SavingAccount(6000);
		acc.rate=0.03;
		System.out.println(acc.getMoney());
		System.out.println(acc.getMonthRate());
		System.out.println(acc.getYearRate());
	}
}
