package thiskeyword;

public class Person {
	//private���� ��� ������ ������ּ���.
	//�̸�, ����, ��, ����
	
	private String name;
	private int age;
	private int money;
	private String major;
	
	//�����ڸ� ������ּ���. 4�� �׸��� ��� �Է¹޾ư� ���ݴϴ�.
	
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	 // �̸� ���� �����ݾ� ������ �ֿܼ� ����ִ�  getInfo()�� �ۼ��غ�����.
	public void getInfo() {
		System.out.println("�̸� : " + this.name +
						", ���� : " + this.age + ", �����ݾ� : " + this.money + 
						", ���� : " + this.major);
	}
}