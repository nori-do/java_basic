package string2;

public class String11P399 {

	public static void main(String[] args) {
		//String.valueOf()�� ��ȣ ������ �ڷ���� ���ڿ��� �ٲ��ݴϴ�.
		String a = String.valueOf(1000);
		//int a = 1000;
		System.out.println(a);
		System.out.println(a + 1);
	
		// �Ǽ� �ϳ��� ���Ƿ� ���ڿ��� �ٲ㼭 �����غ�����.
		String b = String.valueOf(30.2154);
		//double b = 5842.1992;
		System.out.println(b);
		System.out.println(b + 20);
	
		//String.valueOf()�� ���� �ʰ�
		//+ ""�����ε� ���ڿ��� ���� �� �ִ�.
		//�ڹٴ� ���ڿ� + �ٸ��ڷ����� ���� ���� ���� ���ڷ� ġȯ�� ó���Ѵ�.
		String c = 1000 + ""; // = "1000";
		System.out.println(c);
		System.out.println(c+1);
		
		//boolean �ڷ����� ���ؼ� �����е��� ���ϴ� ������� ���ڿ�ȭ �ؼ� �ֿܼ� ������.
		//boolean bool = true;
		//System.out.println(bool +""+ 1);
		String d = false + "";//String.valueOf(false);
		System.out.println(d);
		System.out.println(d + 1);
	}
}
