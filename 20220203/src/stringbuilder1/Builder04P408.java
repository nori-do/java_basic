package stringbuilder1;

public class Builder04P408 {
	public static void main(String[] args) {
		//String���� �κп��� CharAt�� �⺻������ �� ���ڸ� �ǹ��߽��ϴ�.
		//deleteCharAt()�� �׷��� ���ڿ� ���ο���
		//������ �ε��� ��ȣ�� �ش��ϴ� �� �� ���ڸ� �����ϴ�
		// ������ �ǹ��մϴ�.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);
	}
}
