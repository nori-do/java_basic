package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		// ���ڿ��� ���� ���ڷ� ����� ���� �ּҸ� �����Ѵ�.
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hallo";
				
		// ���ڴ� �迭�̱� �ѵ�
		// ������ �Ұ����ϰ� �Ϲ����� �ε�������
		// ���ϴ� ���ڸ� �ϳ��ϳ� �� �� ����.
		//System.out.println(str1[0]);
		//str1[0] = "j";
		
		// �Ϲ� ������ �����ּҰ��� .hashCode()�� ���ϴ�.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//��, newŰ���带 �Ἥ �����ϸ�
		//���� ������ ���ڿ���
		//������ �ּҿ� ����ȴ�.
		String str4 = new String("Hello");
		System.out.println(str4);
		System.out.println(str4.hashCode());
		System.out.println(str1 == str4);
		//.hasahCode�� �˻��ص� ���� ����Ǿ� �ִٸ� �����
		//������ ����Ǿ��ִٰ� �� �� ������ ���� ���� �����
		//���� �ƴϴ�.
		
		// ���ڿ��� �񱳴�(�ּҸ��� ���빰�� ��)
		// .equals()�� ����Ѵ�.
		// ���1.equals(���2);
		System.out.println(str1.equals(str4));
		
	}
}
