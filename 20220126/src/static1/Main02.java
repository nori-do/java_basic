package static1;

public class Main02 {
	public static void main(String[] args) {
		//static ��Ҵ� ���� ���̵� Ȱ���� �� �ִ�.
		//Ŭ������.������ ���� ���������� ������� ȣ�� �����մϴ�.
		System.out.println(StaticTest.num2);
		//System.out.println(StaticTest.num1);
		//check�� ���� ��ȸ�غ�����.
		StaticTest.check();
		
		//StaticTest s1�� ������ �� s1.check();
		//�� ȣ���غ�����.
		StaticTest s1 = new StaticTest();
		s1.check();
	}
}
