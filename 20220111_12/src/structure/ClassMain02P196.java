package structure;

public class ClassMain02P196 {

	
	public static void main(String[] args) {
		// �� 2�� ����
		Car c1 = new Car();
		
		c1.model = "ps-1";
		c1.price = 50000000;
		c1.owner = "�ڱ⵵";
		
		Car c2 = new Car();
		
		c2.model = "as-1";
		c2.price = 100000000;
		c2.owner = "�ڱ��";
		// �ֿܼ� ���� ��ȸ�ϱ�
		
		c1.getInfo();
		System.out.println("==========================================");
		c2.getInfo();
		
	}
}
