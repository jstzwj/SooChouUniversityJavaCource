package question2;

public class Student implements Sortable{
	private int score;
	public Student(){
		score=0;
	}
	public Student(int score){
		this.score=score;
	}
	public String toString(){
		return "ѧ������Ϊ:"+score;
	}
	public int Compare(Sortable s) {
		if(score>((Student)s).score){
			return 1;
		}else if(score==((Student)s).score){
			return 0;
		}else{
			return -1;
		}
	}
}
