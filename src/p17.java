
public class p17 {

	public static void main(String[] args) {
		Car8 car1 = new Car8();	
		car1.setNumGas(1234,20.5);				
		int number = car1.getNum();
		double gasline = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" +  number + "�T�o�q�O" + gasline);
	}

}

class Car8
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	
	int getGas()
	{
		System.out.println("�լd�T�o�q");
		return (int) gas;
	}	
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num  + "�A�N�T�o�q�]��" +  gas );
	}
}