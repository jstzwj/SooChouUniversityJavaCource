package experiment5;
class Rectangle{
	private double width;
	private double height;
	private static String color;
	public Rectangle() {
		
	}
	public Rectangle(double w,double h,String c){
		this.width=w;
		this.height=h;
		color=c;
	}
	public void setWidth(double w) {
		width=w;
	}
	public void setHeight(double h) {
		height=h;
	}
	public static void setColor(String c) {
		color=c;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public static String getColor() {
		return color;
	}
	public double getArea() {
		return width*height;
	}

}
public class test2 {

}
