package string2;

public class String06P399 {
	public static void main(String[] args) {
		//substring()�� �ε��� �������� �� ���ڿ��� �����մϴ�.
		//�ε��� ��ȣ�� �� �� �ָ� ó�� �ε��� ��ȣ ~ �� ��° �ε��� ��ȣ ���̸� �����ݴϴ�.
		
		String str = "�ڹ��ڹ�JSPJSP������������";
		String result = str.substring(5);
		System.out.println(result);
		
		result = str.substring(10,15);
		System.out.println(result);
	}
}
