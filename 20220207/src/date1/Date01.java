package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		//Date�� ��¥�� ǥ���ϴ� Ŭ������ DB��� ����� �� 
		//Date�� �̿��ؼ� ��¥�ڷḦ �޾ƿ��ų� �Ѱ��ִ� ���� ����˴ϴ�.
		//���� i,port java.util.Date�� ���� �Է��ؾ� �� �� �ֽ��ϴ�.
		
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);

		//ǥ���Ǵ� ����� �ٲܶ��� SimoleDateFormat�� Ȯ���մϴ�.
		//import�� �߰��ؾ� �մϴ�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM");// �Ұ�ȣ ���̿� ����� �־����
		//����� yyyy�� ����, MM�� ��, dd�� ��, hh�� ��, mm�� ��, ss�� ��
		String strNow2 = sdf.format(now);// �������� Date ������ sdf������� ���ļ� ����
		System.out.println(strNow2);
		
		//now������ ����ִ� ��¾���� 2022�� 02�� 07�� aa�� bb�� cc�ʷ� �����ؼ� �ֿܼ� ����ּ���
		SimpleDateFormat asdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� : z");
		
		//Ÿ������ z�� ǥ���մϴ�.
		String strNow3 = asdf.format(now);
		
		System.out.println(strNow3);
	
	
	
	
	
	}
}
