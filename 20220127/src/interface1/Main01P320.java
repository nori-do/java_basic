package interface1;

public class Main01P320 {
	public static void main(String[] args) {
		//�������̽��� ���� �θ��ʿ� ��������� ���� ����
		//��� �޼��带 �� �������̵� �ؾ��ϱ� ������
		//�θ�Ÿ�Կ��� �ڽ����� ����� �����Ϸ� �� ��
		//�⺻������ �θ��ʿ��� ������ ������ �����ϴµ� ������ �����ϴ�.
		
		//������ ������ �˰��Ŵ�� ����˴ϴ�.
		Vehicle c1 = new Car("�ڱ⵵");
		c1.accel();
		c1.accel();
		c1.showStatus();
		c1.breakSpeed();
		c1.showStatus();
		c1.breakSpeed();
		c1.showStatus();
		c1.reFuel();
		c1.showStatus();
	}
}
