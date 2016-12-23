package question1;

public class Course {
	private String courseID;
	private String courseName;
	private int credit; 
	private String teacher; 
	public Course(){
		this.courseID="";
		this.courseName="";
		this.credit=0;
		this.teacher="";
	}
	public Course(String courseID){
		this.courseID=courseID;
		this.courseName="";
		this.credit=0;
		this.teacher="";
	}
	public Course(String courseID,String courseName){
		this(courseID,courseName,0);
	}
	public Course(String courseID,String courseName,int credit){
		this(courseID,courseName,credit,"");
	}
	public Course(String courseID,String courseName,int credit,String teacher){
		this.courseID=courseID;
		this.courseName=courseName;
		this.credit=credit;
		this.teacher=teacher;
	}
}
