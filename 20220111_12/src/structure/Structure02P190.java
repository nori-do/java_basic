package structure;

public class Structure02P190 {

	// Person ������ ������ ���� ��ȸ�ϱ� ���� �޼��� ����
	 public static void getInfo(Person p) {
		 System.out.println(p.name + "�� �����Դϴ�.");
		 System.out.println("�̸� : " + p.name + ", ���� :" + p.age + ", ����ó : " + p.pNum + ", ��ȣ :" + p.uNum);
		 
	 }
	 public static void main(String[] args) {
		// ����� �� �� ��������.(a, b)
		 	Person a = new Person();
		 	a.name = "��Ÿ��";
			a.age = 17;
			a.pNum = "01012344321";
			a.uNum = 20;
		 
			Person b = new Person();
			b.name = "�̳׶�";
			b.age = 28;
			b.pNum = "01067899876";
			b.uNum = 21;
			
			getInfo(a);
			System.out.println("--------------------");
			getInfo(b);
	}
}
