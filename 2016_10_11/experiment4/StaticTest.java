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
		
		System.out.println("请输入五个数字表示出售了那些书（1或2或3）");
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
				System.out.println("不存在这本书");
			}
		}
		System.out.println("统计结果");
		System.out.println("第一本书："+a.salenumber);
		System.out.println("第二本书："+b.salenumber);
		System.out.println("第三本书："+c.salenumber);
		System.out.println("总数："+Book.gensalenumber);
	}
}
