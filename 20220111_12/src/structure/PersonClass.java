package structure;

public class PersonClass {
	//��� ������ Person�� �����ϰ� ������ֽõ�
	//�������� �߰��ϰ� ���� Ư�� �ϳ��� �� �߰��غ�����.
	
	public String name;
	public String gender;
	public int age; 
	public String pNum; 
	public int uNum; 
	//public boolean glasses; //�Ȱ� ���� ���� /���� true, ������ false
	
	//getInfo �޼��嵵 ���� PersonClass �ȿ� �����Ѵ�.
	//Ŭ���� ���ο� �����Ҷ��� public �����ʿ� ���� staticŰ���带 ����.
	//�ڱ�� ���� ���� ���� ��Ҵ� �Ҽ� ��� ���� ��ȸ�� �����ϴ�.
	public void getInfo() {
		System.out.println("�̸� : " + name +
							", ���� : " + gender +
							", ���� : " + age +
							", ����ó : " + pNum +
							", ȸ����ȣ : " + uNum);
	}


}
