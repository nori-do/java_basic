package stringbuilder1;

public class Builder05P408 {
	public static void main(String[] args) {
		//���� ���ڿ��� ���ڸ� 0���� �����ؼ� 3��°���� �������ּ���.
		//��Ʈ : �ݺ����� ������.
		//abcdefghijklmnopqrstuvwxyz
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 1; i > 26; i+=2) {
			if(i%3 <26) {
				a.deleteCharAt(i);
				System.out.println(a);	
			}
		}System.out.println("----------------------");
	}
}
