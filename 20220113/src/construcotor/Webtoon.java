package construcotor;

public class Webtoon {
	// ���� �̸� name, ����Ƚ�� series, �۰� painter, �ϰ� ���� complete�� �����ϴ�.
	public String name;
	public int serise;
	public String painter;
	public boolean complete;
	
	
	//�����ڸ� ������ּ���.
	//��� ������ ����Ƚ���� 1�� �����մϴ�.
	//��� �������� ó���� �ϰ���� ���� ���·� �����մϴ�.
	//�ϰ� : true, �̿ϰ� : false
	//�۰��� ������ �׶� �׶� �Է¹޾� �����մϴ�.
	
	public Webtoon(String n, String p) {
		name = n;
		serise = 1;
		painter = p;
		complete = false;
		
	}
	// ���� ���� ��ȸ�ϱ� getInfo()�� ������ּ���
	public void getInfo() {
		System.out.println("���� : " + name +
				", ����Ƚ�� : " + serise +
				", �۰��� : " + painter +
				", �ϰ� ���� : " + complete);
	}
	// ���� ȸ���� ���������(ȸ���� 1�� ����������)uplaoadWebtoon()�� ������ּ���.
	public void uplaoadWebtoon() {
		serise += 1;
	}
	// ���� �ϰ����⸦ ������ completeWebtoon()�� ������ּ���.
	public void completeWebtoon() {
		complete = true;
	}


}
