import java.io.*;

import javax.swing.*;

public class test {
	public static void test0(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String x=br.readLine();
			//接受一行
			System.out.println(x);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}

	}
	public static void test1(){
		int a=20;
		boolean b=true;
		double c=3.14159;
		char d='a';
		System.out.println(a+","+b+","+c+","+d);
	}
	public static void test2(){
		//int a=Math.random();
		int a=(int)Math.random();
		int b=(int)(Math.random()*100);
	}
	public static void test3(){
		int a=20;
		int b=a++;
		//int b=++a;
		System.out.println(a+","+b);
	}
	public static void test4(){
		int a=20;
		int b=3;
		double c=3.2;
		System.out.println(a%b+","+a/c);
	}
	public static void area(){
		String str=JOptionPane.showInputDialog("请输入梯形的上底:");
		double x=Double.parseDouble(str);
		str=JOptionPane.showInputDialog("请输入梯形的下底:");
		double y=Double.parseDouble(str);
		str=JOptionPane.showInputDialog("请输入梯形的高:");
		double z=Double.parseDouble(str);
		double s=(x+y)*z/2;
		JOptionPane.showMessageDialog(null,"面积="+s);
		
	}
	public static void main(String [] args){
		area();
	}
}
