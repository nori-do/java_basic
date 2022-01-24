package polymorphism;

public class Teacher extends Person {
	private int career;
	
	public Teacher(String name, int age, int career) {
		super(name, age);
		this.career = career;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("��� : " + career);
	}
	public void showTeacher() {
		System.out.println("���� �������Դϴ�.");
	}
}