package overriding;

public class Animal {
	// ��� ������ ���������� ������ Ư������ ����
	public String gender;
	public String name;
	public int age;
	
	public void howl() {
		System.out.println("������ ��ϴ�.");
	}
	
	
	public void getInfo() {
		System.out.println("�̸� : "+ name +
						", ���� : " + age +
						", ���� : " + gender);
	}
}
