package casting;

public class Main02 {

	public static void main(String[] args) {
		//Animal�� Cat�� �޾Ƽ� ����
		Animal a = new Cat("���", 3);
		// a������ ����� heap�� �ڷᰡ Cat���� Ȯ��
		System.out.println(a instanceof Cat);//a�� Cat�� ����޾���
		
		//a������ ����� heap�� �ڷᰡ Dog���� Ȯ��
		System.out.println(a instanceof Dog);
		
		System.out.println(a instanceof Animal);//a�� Animal�� ������� �ʾ�����, Animal�� ���ԵǾ� ����.
		
	}
}
