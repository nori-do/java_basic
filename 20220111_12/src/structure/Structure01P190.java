package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		

	
		Person p1 = new Person();
		
		p1.name = "�ڱ⵵";
		p1.age = 20;
		p1.pNum = "01012345678";
		p1.uNum = 32;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		
		Person p2 = new Person();
		
		p2.name = "�ڱ⵵2";
		p2.age = 22;
		p2.pNum = "01099998888";
		p2.uNum = 23;
		System.out.println(p2.name + "�� �����Դϴ�.");
		System.out.println("�̸� " + p2.name + ", ���� : " + p2.age + ", ����ó : " + p2.pNum + ", ��ȣ : " + p2.uNum);
	}
}
