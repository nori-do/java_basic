package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		//Student�� Person�� ����߱� ������
		//Student�� Person�� �ڿ��� ����� �� �ֽ��ϴ�.
		Student s1 = new Student();
		s1.name = "ä����";
		s1.age = 20;
		s1.stuNum = 15;
		
		s1.getInfo();
		s1.getStuInfo();
		
		// Student�� �ϳ� �� ������ֽð�
		// �ڵ�� �����ؼ� �����ֽð�
		// �޸� ������ �׸����� �׷��� ĸ���ؼ� �����ּ���.
		Student s2 = new Student();
		s2.name = "�ڱ⵵";
		s2.age = 23;
		s2.stuNum = 17;
		
		s2.getInfo();
		s2.getStuInfo();
	}
}
