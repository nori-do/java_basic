package math1;

public class Math05P480 {

	public static void main(String[] args) {
		//�ֻ��� ������ ������ּ���.
		//�ֻ��������� �� ���� myValue��
		//��ǻ�� ���� comValue ������ ���� �����߻����� 1~6������ �ο��� ��
		//���� ���ٸ� ������, �ƴϸ� ��, Ȥ�� ��ǻ�� �� ���ڰ� �������� �˷��ִ� ����Դϴ�.
		int myValue = (int)(Math.random() * 6) + 1;
		int comValue = (int)(Math.random() * 6) + 1;
		
		if(myValue < comValue) {
			System.out.println("��ǻ�Ͱ� �¸��߽��ϴ�.");
			System.out.println("�� �� : " + myValue);
			System.out.println("��ǻ�� �� : " + comValue);
		}else if(myValue > comValue) {
			System.out.println("���� �¸��߽��ϴ�.");
			System.out.println("�� �� : " + myValue);
			System.out.println("��ǻ�� �� : " + comValue);
		}else {
			System.out.println("���º��Դϴ�");
			System.out.println("�� �� : " + myValue);
			System.out.println("��ǻ�� �� : " + comValue);
		}
		
	}
}
