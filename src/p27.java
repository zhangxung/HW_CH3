
public class p27 {

	public static void main(String[] args) {
		Car13 car1 = new Car13();		
		car1.show();
		
		Car13 car2 = new Car13(1234,25.0);
		car2.show();
	}

}

class Car13
{
	private int num;
	private double gas;
	
	public Car13()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car13(int n,double g)
	{
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