package inheritance;

//��� ����
//Ŭ������Ī �����ʿ� <extends �θ�Ŭ���� �̸�>�� �����ϴ�.
//�̷��� ����� Ŭ������ �θ�, �ڽ� Ŭ������ �ϳ��� ��ü ���ο�
//�����ϴ� ���·� �޸𸮿� �����˴ϴ�.
public class Student extends Person {
	//name, age
	//����Ӽ�(�̸�, ����)�� �ƴ� �л����� ������ Ư�� ����
	public int stuNum;// �й�
	
	//getStuInfo() �޼��带 �������ּ���.
	// �̸�, ����, �й��� ��� �ֿܼ� ����ݴϴ�.
	
	public void getStuInfo() {
		System.out.println("�̸��� " + name + "�Դϴ�." +
					"���̴� " + age + "�Դϴ�." +
					"�й��� " + stuNum + "�Դϴ�.");
	}
}
