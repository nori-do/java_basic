package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		//�θ� Ÿ���� Person���� �ڽ��� Student���� ���� �� ����
		Person p1 = new Person("�����", 10);
		Person s1 = new Student("���л�", 20, 99);
	
		// p1�� s1�� showPerson�� �ٸ��� ���ư��ϴ�.
		p1.showPerson();//Person �� showPerson()
		System.out.println("---------------------");
		s1.showPerson();//Student �� showPerson()
	
		//s1�� �̿��� �ź� �������� �޼��带 ȣ���غ�����.
		//s1�� PersonŸ���̹Ƿ� Person�� �Ҽӵ�
		//�ڿ��鸸 ȣ���� �� �ֽ��ϴ�.
		//s1.showStudent();
		
	}
}
