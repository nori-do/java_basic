package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		//Person�� �ϳ� ���� �������ֽð�, getInfo()�� ��ȸ���� �غ�����.
		
		Person p1 = new Person("�ڱ⵵", 30, 100000, "����");
	
		p1.getInfo();
		
		// Person�� �ϳ� �� �������ֽð� getInfo()�� ��ȸ���� �غ�����.
		Person p2 = new Person("���ڹ�", 20, 50000, "�����");
		p2.getInfo();
	}
}
