
public class p24 {

	public static void main(String[] args) {
		Car11 car1 = new Car11();	
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("�u�ܧ󨮸�");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("�u�ܧ�T�o�q");
		car1.setCar(30.5);
		car1.show();
	}

}

class Car11
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
			num = n;
			System.out.println("�N�����]��" + num );
	}
	
	public void setCar(double g)
	{
			gas = g;
			System.out.println("�A�N�T�o�q�]��" +  gas );
	}
		
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println();
		System.out.println("�����O" + num + "�T�o�q�O" + gas);
	}
	
	public void show()
	{
		System.out.println("�����O" + this.num);
		System.out.println("�T�o�q�O" + this.gas);
	}
}