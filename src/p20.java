
public class p20 {

	public static void main(String[] args) {
		Car9 car1 = new Car9();	
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	}

}

class Car9
{
	int num;
	double gas;

	void show()
	{
		System.out.println("�T�o�q�O" + this.gas);
		System.out.println("�����O" + this.num);
	}
}