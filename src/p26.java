
public class p26 {

	public static void main(String[] args) {
		Car12 car1 = new Car12();
		
		car1.show();
	}

}

class Car12
{
	private int num;
	private double gas;
	
	public Car12()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void show()
	{
		System.out.println("�����O"+ num );
		System.out.println("�T�o�q�O" + gas);
	}
}