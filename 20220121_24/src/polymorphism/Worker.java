package polymorphism;

public class Worker extends Person{
	private String onesduty;
	
	public Worker(String name, int age, String onesduty) {
		super(name, age);
		this.onesduty = onesduty;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("��å : " + onesduty);
	}
	public void showWorker() {
		System.out.println("���� �������Դϴ�.");
}
}
