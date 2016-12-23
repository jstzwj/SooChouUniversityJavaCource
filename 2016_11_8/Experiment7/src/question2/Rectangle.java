package question2;

public class Rectangle implements Sortable {
	private double width;
	private double height;
	public Rectangle(){
		width=0.0;
		height=0.0;
	}
	public Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	public double area(){
		return width*height;
	}
	public String toString(){
		return "Ãæ»ı:"+area();
	}
	public int Compare(Sortable s) {
		Rectangle other=(Rectangle)s;
		if(this.area()>other.area()){
			return 1;
		}else if(this.area()==other.area()){
			return 0;
		}else{
			return -1;
		}
	}

}
