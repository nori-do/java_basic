package string2;

public class String08P399 {
	public static void main(String[] args) {
		//trim()�� ������ �ƴ� ���ڰ� �����ϱ� ���� ��� ������
		//������ �ƴѹ��ڷ� ���� ���� ������ ��� ������ �����մϴ�.
		String str = "                     Hello             Java                           ";
		System.out.println(str.trim());
		System.out.println(str);

		
		//replace()�� �̿��ؼ� ���̿� �ִ� ������� �� ���ּ� ����غ�����.
		System.out.println(str.replace(" ", ""));
	
		//.trim()�� .replace()�� �̿��� ������ ������ �� �����ֽð�
		//Hello Java�� �����ּ���.
		str.trim();
		//System.out.println(str.replace(str, "Hello Java"));
		System.out.println(str.replace("  ", "").trim());
	
	}
}
