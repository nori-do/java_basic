package stringbuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete�� �� �״�� ���ڿ��� �Ϻ�, Ȥ�� ��ü�� �����մϴ�.
		// Delete(�����ε��� ��ȣ, �� �ε��� ��ȣ) �� �Է��ϸ�
		//������������ ������ ���̸� �����մϴ�.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.delete(3, 10);
		System.out.println(a);
	}
}
