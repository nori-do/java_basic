package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// ���� �ϳ� �������ֽð�
		// �������̵�� �޼������ �ϳ��� ȣ���غ�����.
		Horse h1 = new Horse();
		h1.gender = "��";
		h1.name = "������";
		h1.age = 2;
		h1.rank = 2;
		
		h1.getInfo();
		h1.howl();
	}
}
