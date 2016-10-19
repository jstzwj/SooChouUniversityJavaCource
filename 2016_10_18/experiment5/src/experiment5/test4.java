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
			return "原有余额："+(money-m)+"\n"+
					"今日存款数额："+m+"\n"+
					"最终余额："+money+"\n";
		}else{
			return "数目不符合条件";
		}
		
	}
	public String moneyOut(int m){
		if(m>=0){
			if(money-m<minmoney){
				return "至少保留余额："+minmoney;
			}else{
				money-=m;
				return "原有余额："+(money+m)+"\n"+
						"今日取款数额："+m+"\n"+
						"最终余额："+money+"\n";
			}
		}else{
			return "数目不符合条件";
		}
	}
	public String queryMoney(){
		return "账号："+id+"\n"+
				"姓名："+name+"\n"+
				 "地址："+address+"\n"+
				 "余额："+money+"\n";
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
