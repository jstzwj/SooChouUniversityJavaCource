package question2;

public class TestSort{
	TestSort(){
		Student[] s=new Student[5];
		for(int i=0;i<s.length;i++){
			s[i]=new Student((int)(Math.random()*100));
		}
		Sort.SelectSort(s);
		System.out.println("�����ǰ��������ѧ���ɼ�");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		Rectangle[] ss=new Rectangle[5];
		for(int i=0;i<ss.length;i++){
			ss[i]=new Rectangle((int)(Math.random()*100),(int)(Math.random()*100));
		}
		Sort.SelectSort(ss);
		System.out.println("�����ǰ���������������");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	 }
	
	public static void main(String[] arg){
		new TestSort();
	}
}

