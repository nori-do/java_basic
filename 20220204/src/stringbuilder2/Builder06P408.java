package stringbuilder2;

public class Builder06P408 {

	public static void main(String[] args) {
		//setCharAt()�� ���ڿ����� �Է��� �ε��� ��ȣ�� ���ڸ�
		//�ٸ� ���ڷ� ��ü���ݴϴ�.
		//insert()�� �ڷ� �о ������ Ȯ��������, setCaherAt()��
		//�׳� �� ��ġ�� ���ڸ� ����������ϴ�.
		//setCharAt()�� ���� �� ���� �� ���ڿ� ���ؼ��� ��ü�� �����մϴ�.
		StringBuilder str = new StringBuilder("ascdefg");
		System.out.println(str);
		
		//setChatAt(�� �� �ε���, '����'); ���� ���ڷ� ��ü����� �Է��մϴ�.
		//5�� �ε����� z���� �ٲ㺸����.
		str.setCharAt(5, 'z');
		System.out.println(str);
	}
}
