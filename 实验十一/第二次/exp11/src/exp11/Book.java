package exp11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

@SuppressWarnings("rawtypes")
public class Book implements Comparable,Comparator{
	public Book(){
		
	}
	public Book(String name,int prize){
		this.name=name;
		this.prize=prize;
	}
	public Book(String name,int prize,Date publishTime){
		this.name=name;
		this.prize=prize;
		this.publishTime=publishTime;
	}
	String name="";
	int prize=0;
	Date publishTime=new Date();
	
	@SuppressWarnings("unchecked")
	public static void main(String []args){
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("java",50));
		bookList.add(new Book("cpp",30));
		bookList.add(new Book("c#",20));
		bookList.add(new Book("c",60));
		bookList.add(new Book("python",100));

		Collections.sort(bookList);//comparable
		Collections.sort(bookList,new Book());//comparator
		for(Book each:bookList){
			System.out.println(each);
		}
	}
	@Override
	public int compareTo(Object o) {
		Book rhs=(Book)o;
		if(this.prize>rhs.prize){
			return 1;
		}else if(this.prize==rhs.prize){
			return 0;
		}else{
			return -1;
		}
	}
	public String toString(){
		return "name:"+name+"\nprize:"+prize+"\npublishTime:"+publishTime.toString()+"\n";
	}
	@Override
	public int compare(Object o1, Object o2) {
		Book lhs=(Book)o1;
		Book rhs=(Book)o2;
		if(lhs.prize>rhs.prize){
			return 1;
		}else if(lhs.prize==rhs.prize){
			return 0;
		}else{
			return -1;
		}
	}
}
