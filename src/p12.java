
public class p12 {

	public static void main(String[] args) {
		Car5 car1 = new Car5();
		
		car1.num = 1234;
		car1.gas = 20.5;
				
		car1.showCar();
	}

}
class Car5
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
}