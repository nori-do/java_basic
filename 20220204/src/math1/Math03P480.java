package math1;

public class Math03P480 {

	public static void main(String[] args) {
		//rint()�� ���� ������ ���� ����� ������ �Ǽ����·� �����ݴϴ�.
		double a = 3.500000000000000000000000000000001;
		System.out.println(Math.rint(a));
		
		double b = -3.4999999999999999999999999999999;
		System.out.println(Math.rint(b));
		System.out.println(b);
		
		//round() ���� ����ѵ� round()�� �ݿø��� ���� �����ݴϴ�.
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
	}
}
