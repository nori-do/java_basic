package casting;
//Animal�� ������ּ���
public class Cat extends Animal {

	//�����ڸ� �̿��� �θ��ʿ� �̸�, ���̸� �Է¹޾� �����մϴ�.
	public Cat(String name, int age) {
		super(name, age);
	}
	// cat Ư���� �ൿ�� �ϳ� �޼���� ����� �ֿܼ� XX�� �մϴ� ��� ����ּ���.
	public void jump() {
		System.out.println("����̰� �ݴϴ�.");
	}
	//sit()�� �������̵��ؼ� "����̰� �ɽ��ϴ�."��� �ֿܼ� ������ �������ּ���.
	public void sit() {
		System.out.println("----------------");
		System.out.println("����̰� �ɽ��ϴ�.");
	}
}
