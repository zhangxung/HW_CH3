
public class p47 {

	public static void main(String[] args) {
		Car17 car1 = new Car17();
		car1.show();
		
		int number = 1234;
		double gasline = 20.5;
		String str = "1����";
		
		car1.setCar(number,gasline);
		car1.setName(str);
		
		car1.show();
	}

}

class Car17
{
	private int num;
	private double gas;
	private String name;

	public Car17()
	{
		num = 0;
		gas = 0.0;
		name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("�N���W�]��" + name);
	}
	
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("���W�O" + name);
	}
}