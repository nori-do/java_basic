package string2;

public class String09P399 {

	public static void main(String[] args) {
		//�⺻������ ���ڿ��� ������ �����̱� ������
		//�񱳸� �� �� �ּҰ� �񱳰� �Ͼ�ϴ�.
		String a = new String("�׽�Ʈ");
		String b = new String("�׽�Ʈ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		String c = "�׽�Ʈ";
		String d = "�׽�Ʈ";
		System.out.println(c == d);
		
		//.equals()�� �̿��ϸ� �ּҰ� �񱳰� �ƴ�
		//�ش� �ּҰ� ���ڿ� ���빰�� ���� Ȯ�����ݴϴ�.
		//b�� a�� ���빰 �񱳸� ���ּ���.
		System.out.println(b.equals(a));
	}
}
