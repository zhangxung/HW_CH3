
public class p14 {

	public static void main(String[] args) {
		Car6 car1 = new Car6();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.setNum(1342);
		car1.setGas(20.5);
	}

}

class Car6
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("car1�����O" + this.num);
		System.out.println("car1�T�o�q�O" + this.gas);
	}
	
	void showCar()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
	
	void setNum(int n)
	{
		num = n;
		System.out.println("�N�����]��" + num );
		
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��" +  gas );
	}
	
}