package experiment5;

class t{
	public int memberVar;
}


public class test1 {
	
	public static void main(String []args){
		int localVar=0;
		t tmp = new t();
		System.out.println("成员变量可以不初始化："+tmp.memberVar);
		System.out.println("局部变量必须初始化："+localVar);
	}
}
