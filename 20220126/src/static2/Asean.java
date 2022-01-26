package static2;

public class Asean {
	//�⼮����(check), �߰����(midTerm), �⸻���(fianlTerm)
	//������ �������ּ���.
	//�� �������� ���� ��ü�� ���ε��� �����մϴ�.
	private int check;
	private int midTeram;
	private int fianlTeram;
	
	//���� ��ǥ���� presentationScore�� static���� ������ּ���.
	//�� ������ 19���Դϴ�.
	private static int presentationScore = 19;
	//�����ڴ� ��ü ������ �⼮, �߰����, �⸻��� ������
	//�޾Ƽ� ��ġ�� �Է����ֽʴϴ�.
	public Asean(int check, int midTeram, int fianlTeram) {
		this.check = check;
		this.midTeram = midTeram;
		this.fianlTeram = fianlTeram;
		//this.presentationScore = 19;
	}
	
	// �Ϲ� �޼��� showAseanInfo()�� �������ֽõ�
	//���� ��ü�� �ֿܼ� ��ȸ�ϰ� ���ּ���.
	// �߰���� : xx��, �⸻��� : yy�� ...
	public void showAseanInfo() {
		System.out.println("�߰���� : " + this.midTeram + 
				 ", �⸻��� : " + this.fianlTeram + ", �⼮���� : " + this.check +
				 ", ��ǥ���� : " + presentationScore);
	}
	
	//presentationScore�� private���� ��ȯ�� ���
	//main �������� ���̷�Ʈ�� ��ȸ�� �Ұ����մϴ�.
	//Asean�� newŰ����� ������ �ʰ�
	//private presentationScore�� �ֿܼ� ��ȸ�����ϵ���
	//��ġ�� ���غ�����
	public static int getPresentationScore() {
		return presentationScore;
	}
}
