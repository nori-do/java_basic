package stringbuilder1;

public class Builder01P408 {
	public static void main(String[] args) {
		//StringBuilder�� String Ŭ�������� �������̷� ����
		//�ӵ������� �Ǿ���. �Ϻ� ����� String�� ��ɰ� ��ģ��.
		StringBuilder a = new StringBuilder("abefg");
	
		//2�� ���� ��� �ڷḦ �� 1ĭ�� �ڷ� �а� Ȯ���� ������ "cd"�Է�
		a.insert(2, "cd");
		System.out.println(a);
	
	}
}
