package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		//try~catch������ �ҿ�ð��� �����ּ���.
		//���ο��� �����е��� ���ϴ� �Ӽ��� ���ܸ� �߻���Ű����.
		//throw�� �߻���Ű�� �˴ϴ�.
		//���� : start �� end 
		/*long start = System.currentTimeMillis();
		System.out.println("���۽ð� : " + start);
		
		try {
			//try ������ ���ܰ� �߻��� ���ɼ��� �ִ� ������ ���� �����ֽ��ϴ�.
			System.out.println("�������!");
			System.out.println(start);//���ܰ� �� ���ɼ��� �����ϴ� �ٽ� ����
			System.out.println("��� ��!");
		}catch(Exception e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}finally {
			//����������
			long end = System.currentTimeMillis();
			System.out.println("����ð�: " + (end - start) + " ms");
		}
	}*/
	//���۽ð� ����
		long start = System.currentTimeMillis();
		System.out.println("���� �ð� : " + start);
		try {
			throw new ArithmeticException();
		}catch(Exception e){
			e.printStackTrace();
		}
		//������ �ð� ����
		long end = System.currentTimeMillis();
		System.out.println("������ �ð� : " + end);
		System.out.println("�ҿ�ð� : " + (end = start));
	}
}
