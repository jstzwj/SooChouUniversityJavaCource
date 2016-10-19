package experiment5;

class Fan{
	private double speed;
	private boolean on;
	private double radius;
	private String color;
	public String toString(){
		return "speed:"+speed+"\n"+
				"on:"+on+"\n"+
				"radius"+radius+"\n"+
				"color:"+color+"\n";
	}
	public double getSpeed(){
		System.out.println("Fan in class");
		return speed;
	}
	public boolean getOn(){
		return on;
	}
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public void setSpeed(double s){
		speed=s;
	}
	public void setOn(boolean o){
		on=o;
	}
	public void setRadius(double r){
		radius=r;
	}
	public void setColor(String c){
		color=c;
	}
}
public class test3 {
	public static void main(String[] args){
		Fan f= new Fan();
		System.out.println(f.toString());
	}
	
}
