package overloading;

public class Main02 {
	public static void main(String[] args) {
		// �˹ٻ� ���� ������ּ���.
		// �ϳ��� �ñ��� 15000������ ���ֽð�
		// �ٸ� �ϳ��� �Է� ���� �������ּ���.
		
		Parttimer p1 = new Parttimer(true,15000,"���̳�����","�ڱ⵵");
		System.out.println("---------------------------------------------------------");
		Parttimer p2 = new Parttimer(true,"�Ե�����","���ڹ�");
		System.out.println("---------------------------------------------------------");
		//�ñ� 5000���� �ְ� ��ƮŸ�̸Ӹ� ��������.
		Parttimer p3 = new Parttimer(false,1000,"�̽�������","���ڵ�");
	}
}
