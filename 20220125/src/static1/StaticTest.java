package static1;

public class StaticTest {
	//static�� �� ���� ������ ��ü�� ���������� ������ �����Դϴ�.
	public int num1;
	
	//static(����)������ ��� ��ü�� �����ϴ� �ϳ��� �����Դϴ�.
	//static������ ��ü��(new Ű����� �ڷḦ) �����ϱ� ������ �����մϴ�.
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 += 5;
		num2 +=1;
		System.out.println("num1 ������ ������ �ʽ��ϴ�. : " + num1);
		System.out.println("���� �����ڼ� : " + num2 + "��.");
	}
}
