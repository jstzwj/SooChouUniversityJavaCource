package experiment4;

import java.util.Scanner;

class Book{
	public Book(String title){
		this.title=title;
		//this.salenumber=salenumber;
		//gensalenumber+=salenumber;
	}
	public void sale(){
		salenumber++;
		gensalenumber++;
	}
	public void sale(int num){
		salenumber+=num;
		gensalenumber+=num;
	}
	String title;
	int salenumber;
	static int gensalenumber=0;
}

public class StaticTest {
	public static void main(String []args){
		Book a=new Book("cpp");
		Book b=new Book("java");
		Book c=new Book("python");
		
		System.out.println("������������ֱ�ʾ��������Щ�飨1��2��3��");
		Scanner in= new Scanner(System.in);
		for(int i=0;i<5;++i){
			switch(in.nextInt()){
			case 1:
				a.sale();
				break;
			case 2:
				b.sale();
				break;
			case 3:
				c.sale();
				break;
			default:
				System.out.println("�������Ȿ��");
			}
		}
		System.out.println("ͳ�ƽ��");
		System.out.println("��һ���飺"+a.salenumber);
		System.out.println("�ڶ����飺"+b.salenumber);
		System.out.println("�������飺"+c.salenumber);
		System.out.println("������"+Book.gensalenumber);
	}
}
