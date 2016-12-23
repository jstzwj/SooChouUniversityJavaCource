package question1;

public interface Fight {
	void fight();
}
class FatFat implements Fight{
    public void fight(){
        System.out.println("FatFat 打人很痛!");
    }
}
class ThinThin implements Fight{
    public void fight(){
        System.out.println("ThinThin 打人一点都不痛！！哈哈。");
    }
}
