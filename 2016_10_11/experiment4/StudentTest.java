package experiment4;

class Student{
	public Student(String id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return id+","+name+","+age;
	}
	String id;
	String name;
	int age;
}
public class StudentTest {
	public static void main(String []args){
		Student []allStudent= new Student[4];
		allStudent[0]=new Student("1427403012","cpp",35);
		allStudent[1]=new Student("1427403013","java",23);
		allStudent[2]=new Student("1427403014","python",19);
		allStudent[3]=new Student("1427403015","golang",4);
		
		for(Student i:allStudent){
			i.age++;
		}
		
		for(Student i:allStudent){
			System.out.println(i);
		}
		
		System.out.println("年龄大于20岁的学生的名单：");
		for(Student i:allStudent){
			if(i.age>20){
				System.out.println(i);
			}
		}
		
	}
}
