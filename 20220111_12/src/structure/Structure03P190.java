package structure;

public class Structure03P190 {

	public static void getInfo(Cat c) {
		System.out.println(c.name + "�� �����Դϴ�.");
		 System.out.println("�̸� : " + c.name + ", ���� :" + c.age + ", �� : " + c.color);
	}
	public static void main(String[] args) {
		
		Cat a = new Cat();
		
		a.name = "�׷�";
		a.age = 1;
		a.color = "������";
		
		Cat b = new Cat();
		
		b.name = "�÷�";
		b.age = 5;
		b.color = "���";
	
		getInfo(a);
		System.out.println("-----------------");
		getInfo(b);
	}
	
}
