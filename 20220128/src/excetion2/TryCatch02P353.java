package excetion2;

public class TryCatch02P353 {
	public static void main(String[] args) {
		//���� exception ��Ű�� ������ ���� �������� ���� �վ��µ�
		//�� �� �ϳ��� ��� ���ܰ� �߻��� �� �ִ� �ڵ�� �ۼ����ּ���.
		//�߻��� ���ܿ� ���� ó���� try~catch ����� Ȱ���մϴ�.
		// by 0(0���� ������)�� ���� ó���� ������� �ʽ��ϴ�.
		String[] name = {"���ڹ�", "���̿�����", "�ڽ�����"};
		
		try {
			//0,1,2�� �ε������� ������ 3���� ��ȸ�ϵ��� �ݺ��� �ۼ�
			
			//for(int i = 0; i < 3; i++) {
			//System.out.println(name[i]);
			
			//����Ʈ ���� ��Ҹ� ��ȸ�� ���� ���� for���� ���°� �����ϴ�.
			//���� �ε����� ������ ���� �����ϴ�.
			for(String n : name) {
				System.out.println(n);
			}
		}catch(Exception e) {
			System.out.println("�� �̻� �л��� ���µ� �ε����� ��� ���Ƚ��ϴ�.");
		}finally {
			System.out.println("���谡 �������ϴ�.");
		}
	
	
	
	

		
		
	}
}