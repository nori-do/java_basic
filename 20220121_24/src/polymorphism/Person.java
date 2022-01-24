package polymorphism;

public class Person {
	//����� ��Ÿ���� Ŭ����
	//��Ӹ��� �������� �ϴ� Ŭ����
	//Person�� ��ӹ��� �ڽĵ��� ����
	//Person�� �䱸�ϴ� �ڸ��� ���Ե� �� �ִ�.
	private String name;
	private int age;
	
	// �����ڰ� �̸��� ���̸� �޾� �ʱ�ȭ�ϰ� ���ּ���.
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Person�� ��ü �����͸� �ֿܼ� ����ִ� showPerson()
	//PersonŸ������ ȣ������ �� �����ϰ� ȣ�� ������ �޼���
	// �� �޼��带 �ڽ��ʿ� �������̵� �ϸ�
	// �θ�Ÿ�����ε� �ڽ��� showPerson()�� ȣ���� �� �ִ�.
	
	public void showPerson() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
	//setter/getter�� ������ּ���.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
