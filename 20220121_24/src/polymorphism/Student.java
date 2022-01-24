package polymorphism;
// �θ� Ŭ������ Person���� �������� ����� ���ּ���
public class Student extends Person {
	// �л��� ����� grade(����) ������ �����մϴ�.
	private int grade;
	
	//super()�� �̿��� Person(�θ�) �����ڱ��� Ŀ���ϴ� �����ڸ� ������ּ���
	//name, age, grade���� ��� �Է¹޽��ϴ�.
	//�θ��ʿ��� �� �ڿ��� name, age�� �θ������� �Ѱ��� ����
	//grade�� �ڽ��� �޾Ƽ� ���ϴ�.
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	//��ӹ��� showPerson()�� Ȱ���� �޼��带 �߰��� �ۼ��� grade�� ������ ���ּ���.
	public void showPerson() {
		//�θ��� showPerson()�� �̹� name, age�� ������ִ� ������ �ִ�.
		//System.out.println("�̸� : " + getName());
		//System.out.println("���� : " + getAge());
		super.showPerson();
		System.out.println("���� : " + grade);
	}
	
	//"���� �л��Դϴ�."��� �ֿܼ� ��� showStudent �޼��带 Student���� �ۼ��մϴ�.
	public void showStudent() {
		System.out.println("���� �л��Դϴ�.");
	}
	
}
