package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal Ÿ���� � �ڷ����̰� ���� �� �ֽ��ϴ�.
		// Cat, Dog, Animal�� �ϳ��� ����� �ּ���.
		// Animal c1. d1. a1���� �޾��ּ���.
	Animal c1 = new Cat("�����", 1);
	Animal d1 = new Dog("������", 3);
	Animal a1 = new Animal("����", 4);
	
	//c1, d1, a1�� ���ؼ� .sit()�� ���� ȣ���غ�����.
	c1.sit();
	d1.sit();
	a1.sit();
	
	//�� �ڷ����� �ٺ��� �ڷ����� ���缭 �ǵ������ڽ��ϴ�.
	Cat cat = (Cat)c1;
	//c1�� AnimalŸ���̳�, ���� ����� �����Ͱ� Cat
	//�̹Ƿ� Cat���� ��ȯ�� ������.
	cat.jump();
	
	//a1�� ��/���� ��ο� Animal�θ� ����Ǿ� �־�
	//�ٸ� �ڷ������� ��ȯ�� �Ұ����մϴ�.
	Cat cat2 = (Cat)a1;
	cat2.jump();
	
	
	}
	
}
