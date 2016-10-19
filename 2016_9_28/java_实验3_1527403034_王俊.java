package experiment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class test2 {
public static int test_3_1(){
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	s.close();
	if(x<=0){
		System.out.println(0);
		return 0;
	}else if(x<5){
		System.out.println(2*x+1);
		return 2*x+1;
	}else{
		System.out.println(x*x-1);
		return x*x-1;
	}
	
}
public static int test_3_2(){
	/*
	if(n!=0){
		return 2*test_3_2(n-1)+1;
	}
	else{
		return 1;
	}
	*/
	int result=1;
	String str=JOptionPane.showInputDialog("请输入一个数:");
	int n=Integer.parseInt(str);
	for(int i=0;i<n;++i)
	{
		result=result*2+1;
	}
	JOptionPane.showMessageDialog(null, result);
	return result;
}
public static double test_3_3(){
	Scanner s=new Scanner(System.in);
	int num=-1;
	int n=0;
	int []scoreSegment;
	double average=0;
	scoreSegment=new int[5];
	do{
		num=s.nextInt();
		if(num>=0&&num<60){
			++scoreSegment[0];
		}else if(num>=60&&num<70){
			++scoreSegment[1];
		}else if(num>=70&&num<80){
			++scoreSegment[2];
			++scoreSegment[1];
		}else if(num>=80&&num<90){
			++scoreSegment[3];
			++scoreSegment[1];
		}else if(num>=90&&num<=100){
			++scoreSegment[4];
			++scoreSegment[1];
		}else if(num==-1){
			break;
		}else{
			System.out.println("数据出错");
			break;
		}
		++n;
		average+=num;
	}while(num!=-1);
	average/=n;
	System.out.println("不及格人数："+scoreSegment[0]);
	System.out.println("及格人数："+scoreSegment[1]);
	System.out.println("中等人数："+scoreSegment[2]);
	System.out.println("良好人数："+scoreSegment[3]);
	System.out.println("优秀人数："+scoreSegment[4]);
	System.out.println("平均分："+average);
	s.close();
	return average;
}
public static int test_3_4(){
	int n=0;
	for(int i=10;i<=100;++i){
		if(i%3==0||i%5==0){
			++n;
			System.out.print(i);
			if(n==5){
				System.out.print('\n');
				n=0;
			}else{
				System.out.print(' ');
			}
		}
	}
	return n;
}
public static String test_3_5(int n,int dig){
	String result="";
	while(n!=0){
		String tmp="";
		int num=n%dig;
		if(num>=0&&num<10){
			tmp+=(char)(num+'0');
		}else{
			tmp+=(char)(num-10+'A');
		}
		
		tmp+=result;
		result=tmp;
		n/=dig;
	}
	return result;
}
public static int factorial(int x){
	int result=1;
	while(x!=0){
		result*=x;
		--x;
	}
	return result;
}
public static void test_3_6(){
	for(double x=0.2;x<=1.0;x+=0.2){
		double oldNum=0.0;
		double curNum=1.0;
		int n=0;
		double result=0.0;
		while(!(curNum-oldNum>-1e-6&&curNum-oldNum<1e-6)){
			oldNum=result;
			result+=Math.pow(x, n)/factorial(n);
			++n;
			curNum=result;
		}
		System.out.println(result);
	}
	
}
public static void test_3_7(){
	int x[]=new int[20];
	double average=0.0;
	for(int k=0;k<x.length;++k){
		x[k]=100+(int)(Math.random()*900);
		average+=x[k];
		System.out.print(x[k]+" ");
	}
	average/=x.length;
	System.out.print("平均值："+average);
}
public static void main(String []args){
	test_3_1();
	test_3_2();
	test_3_3();
	test_3_4();
	test_3_5(16,16);
	test_3_6();
	test_3_7();
	
	
}


}
