
public class p15 {

	public static void main(String[] args) {
		Car7 car1 = new Car7();
		
		int number = 1234;
		double gasline = 20.5;
		
		car1.setNumGas(number,gasline);
	}

}

class Car7
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("car1�����O" + this.num);
		System.out.println("car1�T�o�q�O" + this.gas);
	}
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num  + "�A�N�T�o�q�]��" +  gas );
	}
}