package construcotor;

public class Main03P204 {

	public static void main(String[] args) {
		//���� 2���� ���� ���� ���� �� �ϰ���� ���Ѻ�����.
		// ���� ȸ���� 3~4ȸ�� ���ּ���
		
		Webtoon w1 = new Webtoon("�ڵ��� ����"
								, "�ڹ�");
		
		w1.getInfo();
		w1.uplaoadWebtoon();
		w1.uplaoadWebtoon();
		w1.uplaoadWebtoon();
		w1.getInfo();
		w1.completeWebtoon();
		w1.getInfo();

		System.out.println("================================================================");
		
		Webtoon w2 = new Webtoon("�б��� ����", "�л�");
		
		w2.getInfo();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.uplaoadWebtoon();
		w2.completeWebtoon();
		w2.getInfo();
	
	}
}
