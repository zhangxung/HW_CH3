
public class p28 {

	public static void main(String[] args) {
		Car14 car1 = new Car14();		
		car1.show();
		
		Car14 car2 = new Car14(1234,25.0);
		car2.show();
	}

}

class Car14
{
	private int num;
	private double gas;
	
	public Car14()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car14(int n,double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("�Ͳ��F���l" + num + "�A�T�o�q��" + gas + "�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+ num );
		System.out.println("�T�o�q�O" + gas);
	}
}