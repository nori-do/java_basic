package stringbuilder2;

public class Builder07P408 {
	public static void main(String[] args) {
		//toString()���� �ڷḦ String���� �ٲ��ݴϴ�.
		//StringBuilder �ڷ����� Stringó�� �������� 
		//������ ���ϸ� String�� �ƴϱ� ������
		//�ٽ� �� ��ȯ�� ������մϴ�
		StringBuilder str = new StringBuilder("�����ٶ󸶹ٻ�");
	
		//�ڷ��� ����ġ
		//String hangul = (String)str;
		//String���� ��ȯ�Ҷ��� str.toString()�� �ٿ��� �ڷắȯ�� ���ݴϴ�.
		String hangul = str.toString();
		
		System.out.println(hangul);
		
		// String�ڷ����� hanul�� �ٽ� StringBuilder������ �ٲ㼭
		//StringBuilder str2�� �������ּ���.
		StringBuilder str2 = new StringBuilder(hangul);
		System.out.println(hangul);
		
		
		
	
	}
}
