package string2;

public class String04P399 {

	public static void main(String[] args) {
		//.length()�� ���ڿ��� ���̸� �� �� �ֽ��ϴ�.
		//������ �� �������� �˷��ݴϴ�.
		String name = "����ѹ� �ź��̿� �η�� ��õ���� ����� ġġī�� ���縮��Ÿ";
		System.out.println(name.length());
		
		//.replace()�� ã�ƹٲٱ� �Դϴ�.
		//.replace("ã�� �ܾ�", "�ٲ��� �ܾ�"); ������ �Է��մϴ�.
		String report = "�ȳ��ϼ���. ����Ʈ �����ڴ� �迵��, �迵�� �Դϴ�.";
		//.replace�� return�� String�̰�, �׳��� �ܼ�â�� ����� �� �����ϴ�.
		report.replace("�迵��", "�迵��");
		System.out.println(report.replace("�迵��", "�ڱ⵵"));
		//.replace()�� �ùķ��̼Ǹ� �ϱ� ������ �����ص� ���� ���ڿ��� ���������� ������ �ʽ��ϴ�.
		System.out.println(report);
		
		
		//�ٲ� ������ ������� �ϰ� �ʹٸ�...
		report = report.replace("�迵��", "�ڱ⵵");
		System.out.println(report);
	}
}
