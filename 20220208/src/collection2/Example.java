package collection2;

public class Example {

	private int a;
	private int b;
	
	public Example() {
		this.a = 1;
		this.b = 2;
	}
	//Ư�� ��ü�� System.out.println()���� ��ȸ��
	//�������̵��� toString()�� �����ϸ� �ּҰ� ���
	//toString���� �����ϴ� ���ڿ��� �ֿܼ� ��������.
	
	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}

	


}
