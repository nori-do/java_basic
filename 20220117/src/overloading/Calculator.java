package overloading;

public class Calculator {

	public void plus(int a) {//�Ķ���ͷ� int a���� �䱸
		System.out.println(a + "�� 1�� ���� ���� " 
					+ (a + 1));
	}
	public void plus(int a, int b) {//�Ķ���͸� int a, int b�� �䱸
		System.out.println(a + "�� " + b +
				"�� ���� ���� " + (a + b) + "�Դϴ�.");
	}
	public void plus(double a) {// �Ķ���� ������ double a �䱸
		System.out.println(a + "�� 0.5�� ���� ���� " +
						(a+0.5) + "�Դϴ�.");
	}
	public void plus(String str) {// �Ķ���Ͱ����� String str �䱸( ���ڿ��� ���� ����� �ƴմϴ� ���)
		System.out.println("���ڿ��� ���� ����ڰ� �ƴմϴ�.");
	}
}