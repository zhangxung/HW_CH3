
public class p31 {

	public static void main(String[] args) {
		Car15.showSum();
		Car15 car1 = new Car15();		
		car1.setCar(1234,20.5);
		
		Car15.showSum();			
		Car15 car2 = new Car15();
		car2.setCar(7895,30.5);
	}

}

class Car15
{
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car15()
	{
		num = 0;
		gas = 0.0;
		sum ++;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F���l" + num + "�A�T�o�q��" + gas + "�����l");
	}
	
	public static void showSum()
	{
		System.out.println("���l��" + sum + "�x" );
	}
	public void show()
	{
		System.out.println("�����O"+ num );
		System.out.println("�T�o�q�O" + gas);
	}
}