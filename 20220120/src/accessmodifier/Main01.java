package accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		//Magician�� �ϳ� �������ּ���.
		Magician m1 = new Magician("asd");
		// getInfo()�� ������ ��ȸ���ּ���.
		m1.getInfo();
		System.out.println("------------------------");
		//hunt()�� 2�� ȣ���� ����� 2�� ���ּ���.
		m1.hunt();
		m1.hunt();
		System.out.println("------------------------");
		//����� ������ �ٽ� getInfo()�� ���ּ���
		m1.getInfo();
		m1.fireball();
		m1.getInfo();
		
		
	}
}