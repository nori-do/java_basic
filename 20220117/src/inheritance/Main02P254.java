package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// ���⿡ �л� �ϳ��� �������� �ϳ��� ���Ƿ� ��������.
		// �������ǿ��� ���� �̸��� ��� ������ �����ּ���.
		// �л��� �׳� �˾Ƽ� �ۼ����ּ���.
		// ������ ��ü�� ������ get~~~Info()�� �̿��� �ֿܼ��� ����ּ���.
		
		Student s1 = new Student();
		s1.name = "��¯��";
		s1.age = 17;
		s1.stuNum = 1;
		
		s1.getStuInfo();
		
		Salartman sa1 = new Salartman();
		sa1.name = "ö��";
		sa1.age = 30;
		sa1.salary = 30000000;
		
		sa1.getSalaryInfo();
	}
}
