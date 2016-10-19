package experiment4;

class Point{
	int x,y;
	public Point(){
		//x=0;
		//y=0;
		this(10,10);
	}
	/*
	public Point(int x1,int y1){
		x=x1;
		y=y1;
	}
	*/
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return x+","+y;
	}
}

public class Exp {
	public static void main(String []args){
		Point a=new Point();
		System.out.println(a);
		
		Point b=a;
		a.x=5;
		System.out.println(b);
		
		b=new Point(8,3);
		System.out.println(a);
		System.out.println(b);
		
		b=null;
		System.out.println(b);
		
		Point []c=new Point[8];
		c[0]=a;
		c[1]=b;
		c[6]=new Point(4,6);
		for(int k=0;k<c.length;++k){
			System.out.println(c[k]);
		}
		
		c[7]=new Point();
		
		
		
	}
}
