package string2;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		//�α��� ������ �����ڽ��ϴ�.
		//���� Sting id�� �������� ������ ������ ���̵�
		String id = "";
		//String pw�� �������� ������ ������ ��й�ȣ�� �������ּ���.
		String pw = "";
		//����, ����ڿ��� Scanner�� �̿���
		Scanner sc = new Scanner(System.in);
		//uId �������� ���̵�(����ڰ� �Է��� ���̵�)
		System.out.println("����� ���̵� �Է����ּ���.");
		String uId = sc.nextLine();
		id = uId;
		
		//���ǹ��� �̿��ؼ� �⺻ id�� �Է¹��� �ڷ�� ��ġ�ϸ�
		if(uId.equals(id)) {
			System.out.println("��й�ȣ�� �Է����ּ���.");
			String uPw = sc.nextLine();
			if(uPw.equals(pw)){
				//uPw�������� ��й�ȣ��(����� �Է�) �޾Ƽ� XX�� �α��ο� �����߽��ϴ�.
				System.out.println(id + "�� ȯ���մϴ�.");
			}else {
				//id�� ��ġ�ϳ� ��й�ȣ�� Ʋ���� "��й�ȣ�� Ʋ�Ƚ��ϴ�."
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}else {
			//id�� ��ġ���� ������ "�׷� ���̵�� �����ϴ�."
			System.out.println("�׷� ���̵�� �����ϴ�.");
		}
	}
}
