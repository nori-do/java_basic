package interface1;

public class Main02P320 {
	public static void main(String[] args) {
		//������ ���� �� �۵��ϴ��� üũ�غ�����.
		
		Vehicle t1 = new Train("�ڱ⵵");
		
		t1.accel();
		t1.accel();
		t1.showStatus();
		t1.breakSpeed();
		t1.showStatus();
		t1.reFuel();
		t1.showStatus();
	}
}
