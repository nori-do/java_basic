package string1;

public class String02P399 {

	public static void main(String[] args) {
		//indexOf()�� Ư�� ���ڿ��� ���� �ε��� ���� ��ȯ�մϴ�.
		//���� Ư�� ���ڿ��� ���ԵǾ� ���� �ʴٸ� -1�� �����մϴ�.
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		//ù ���� to�� 0������ ����
		System.out.println(get);
		
		//�ߺ����� ����(0���� �ƴ� 1�� �ε������� ��ȸ�ؼ� ó������ ������ to��ȸ)
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		//���� ���ڿ� ��ȸ�� -1�̶�� ������ �ε��� ��ȣ�� �ݴϴ�.
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}
