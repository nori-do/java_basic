package casting;

public class Animal {
	//�̸� ���̸� �����ϴ�.
	private String name;
	private int age;
	//�����ڿ����� ��� �Է¹޾� �ʱ�ȭ�մϴ�.
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//sit()�� �����ϸ� �ܼ�â�� "�ɽ��ϴ�."��� �����ϴ�.
	public void sit() {
		System.out.println("----------------");
		System.out.println("�ɽ��ϴ�.");
	}
}
