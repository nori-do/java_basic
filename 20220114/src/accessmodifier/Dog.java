package accessmodifier;

public class Dog {//���Ǻ�
	//�������� ������ ���������� 3�� �ο��ּ���.
	// String name�� �����Դϴ�.
	public String name;
	private int age;
	private String color;
	
	//�����ڷ� ������ ������ ó���Ͻõ�
	//�̸��� ������ �Է¹ް� ���ּ���.
	public Dog(String n, String c) {
		name = n;
		age = 1;
		color = c;
		
	}
	//��ġ �������� ����Ǵ� ������ �޼��� �ϳ��� ������ּ���.
	public void newyear(){
		age += 1;
	}
	public void getInfo() {
		System.out.println("�������� �̸� : " + name +
						", ���� : " + age +
						", �� : " + color);
	}
}