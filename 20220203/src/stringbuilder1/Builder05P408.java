package stringbuilder1;

public class Builder05P408 {
	public static void main(String[] args) {
		//���� ���ڿ��� ���ڸ� 0���� �����ؼ� 3��°���� �������ּ���.
		//��Ʈ : �ݺ����� ������.
		//abcdefghijklmnopqrstuvwxyz
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 1; i > 26; i+=2) {
			System.out.println("i%3�ǰ�� : " + i % 3);
			System.out.println("���� i�� �� : " + i);
			System.out.println(a);
			System.out.println("----------------------");
			if(i%3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}
}
