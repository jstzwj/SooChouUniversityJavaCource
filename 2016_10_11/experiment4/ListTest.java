package experiment4;

class Node{
	int data;
	Node next;
}
public class ListTest {
	public static void main(String []args){
		//��������
		Node head= new Node();
		head.data=(int) (Math.random()*1000);
		head.next=null;
		//���Ԫ��
		Node tail=head;
		for(int i=0;i<9;++i){
			Node tmp=new Node();
			tmp.data=(int) (Math.random()*1000);
			tmp.next=null;
			tail.next=tmp;
			tail=tmp;
		}
		
		//�������
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
		//ͷβ�Ӹ�100
		//ͷ
		Node tmp=new Node();
		tmp.data=100;
		tmp.next=head;
		head=tmp;
		//β
		cur=head;
		while(cur.next!=null){
			cur=cur.next;
		}
		tmp=new Node();
		tmp.data=100;
		tmp.next=null;
		cur.next=tmp;
		
		//���
		cur=head;
		System.out.println("ͷβ���100�Ժ�");
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
		
	}
}
