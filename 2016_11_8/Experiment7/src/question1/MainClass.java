package question1;

public class MainClass {
	static void f(Fight c){
		c.fight();
	}
	public static void main(String [] args){
		Fight a=new FatFat();
		Fight b=new ThinThin();
		a.fight();
		b.fight();
	}
}
