package question1;

public interface Fight {
	void fight();
}
class FatFat implements Fight{
    public void fight(){
        System.out.println("FatFat ���˺�ʹ!");
    }
}
class ThinThin implements Fight{
    public void fight(){
        System.out.println("ThinThin ����һ�㶼��ʹ����������");
    }
}
