package experiment5;
class Account{
	public String id;
	public String name;
	public String address;
	public int money;
	public int minmoney;
	
	public String moneyIn(int m){
		if(m>=0){
			money+=m;
			return "ԭ����"+(money-m)+"\n"+
					"���մ�����"+m+"\n"+
					"������"+money+"\n";
		}else{
			return "��Ŀ����������";
		}
		
	}
	public String moneyOut(int m){
		if(m>=0){
			if(money-m<minmoney){
				return "���ٱ�����"+minmoney;
			}else{
				money-=m;
				return "ԭ����"+(money+m)+"\n"+
						"����ȡ�����"+m+"\n"+
						"������"+money+"\n";
			}
		}else{
			return "��Ŀ����������";
		}
	}
	public String queryMoney(){
		return "�˺ţ�"+id+"\n"+
				"������"+name+"\n"+
				 "��ַ��"+address+"\n"+
				 "��"+money+"\n";
	}
	
	
	
	
}
public class test4 {
	public static void main(String []args){
		Account acc=new Account();
		System.out.println(acc.queryMoney());
		System.out.println(acc.moneyIn(123));
		System.out.println(acc.moneyOut(12));
	}
}
