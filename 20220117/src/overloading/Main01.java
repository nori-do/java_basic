package overloading;

public class Main01 {

	public static void main(String[] args) {
		//1. Calculator�� �������ּ���.
		Calculator c1 = new Calculator();
		//2. plus(int)�� ȣ���غ�����.
		c1.plus(4);
		//3. plus(int a, int b)�� ȣ���غ�����.
		c1.plus(7,6);
		//4. plus(double)�� ȣ���غ�����
		c1.plus(1.0);
		//5. plus(String)�� ȣ���غ�����.
		c1.plus("�ȳ��ϼ���");
		
	}
}