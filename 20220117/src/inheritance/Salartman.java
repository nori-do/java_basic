package inheritance;

//person�� ����ؼ� Salaryman�� ��������.
// ���������� ����(salary)�� �����ϴ�.
// getSalaryInfo()�� ���¸� ��ȸ�� �� �ֽ��ϴ�.
public class Salartman extends Person{
	// �߰� ����(�������Ǹ� ������ Ư��)
	public int salary; //����
	
	public void getSalaryInfo() {
		System.out.println("�̸��� " + name + 
				", ���̴� " + age +
				", ������ " + salary + "�Դϴ�.");
	}
}
