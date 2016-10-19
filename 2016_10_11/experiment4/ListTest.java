package experiment4;

class Node{
	int data;
	Node next;
}
public class ListTest {
	public static void main(String []args){
		//产生链表
		Node head= new Node();
		head.data=(int) (Math.random()*1000);
		head.next=null;
		//添加元素
		Node tail=head;
		for(int i=0;i<9;++i){
			Node tmp=new Node();
			tmp.data=(int) (Math.random()*1000);
			tmp.next=null;
			tail.next=tmp;
			tail=tmp;
		}
		
		//输出链表
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
		//头尾加个100
		//头
		Node tmp=new Node();
		tmp.data=100;
		tmp.next=head;
		head=tmp;
		//尾
		cur=head;
		while(cur.next!=null){
			cur=cur.next;
		}
		tmp=new Node();
		tmp.data=100;
		tmp.next=null;
		cur.next=tmp;
		
		//输出
		cur=head;
		System.out.println("头尾添加100以后：");
		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
		
	}
}
