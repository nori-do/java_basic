package structure;

public class ClassMain01P196 {
	//PersonClass�� ��ȸ�� �޼���� �ۼ��� �ʿ䰡 ����.
	//�̹� PersonClass ���ο� �ʿ��� �޼��带 �ۼ��س��� �����̴�.
	
	public static void main(String[] args) {
		//����� �� �� ��������(personClass)
		PersonClass p1 = new PersonClass();
		p1.name = "�ڱ⵵";
		p1.age = 30;
		p1.gender = "��";
		p1.pNum = "01012345678";
		p1.uNum = 1;
		
		PersonClass p2 = new PersonClass();
		p2.name = "�ڱ��";
		p2.age = 28;
		p2.gender = "��";
		p2.pNum = "01012349999";
		p2.uNum = 2;
		// ���� ��� �� ���� ������ �ֿܼ� ������.
		//*��Ʈ getInfo�� �Ҽ���?	
		p1.getInfo();
		System.out.println("=================================");
		p2.getInfo();
	
	
	
	}

	private static void getInfo(PersonClass p2) {
		// TODO Auto-generated method stub
		
	}
}
