package system1;

public class TimeCheck01P384 {
	public static void main(String[] args) {
		//currentTimeMils�� �ڷ�� long���� �����ؾ� �մϴ�.
		//��������
		long start = System.currentTimeMillis();
		System.out.println("���۽ð� : " + start);
		
		long all = 0;
		
		for(long i = 0; i < 200000000000L; i++) {
			all += i;
		}
		System.out.println("1���� 2000����� ���� : " + all);
		
		//������ ����
		long end = System.currentTimeMillis();
		System.out.println("�����ð� : " + end);
		System.out.println("�ҿ�ð� : " + (end - start));
	}
}
