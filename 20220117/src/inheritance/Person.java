package inheritance;

public class Person {
	//����̶�� ���������� ���� �� �ִ� �Ӽ����� �����Ѵ�.
	public String name;
	public int age;
	
	//getInfo() �޼��� �����غ���
	//�̸��� name�Դϴ�. ���̴� age�Դϴ�. ��� ��� ��������.
	public void getInfo() {
		System.out.println("�̸��� "+ name + "�Դϴ�." +
					"���̴� " + age + "�Դϴ�.");
	}
}
