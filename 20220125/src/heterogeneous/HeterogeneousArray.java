package heterogeneous;

public class HeterogeneousArray {
	public static void main(String[] args) {
		//int[]���� ���ָ� ���� �� ����.
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		//int[] iArr = {1,2, "a", "b"};//���ڿ��� �־ ���� �߻�
		
		// iArr�� ���� for������ ����غ�����.
		for(int iValue:iArr) {
			System.out.println(iValue);
		}
		
		// ���� �ڷḦ ���� �� �ֵ��� ��� Ŭ������ �θ��� Object�� �迭 ����
		//Object�� �������� ������ ���� ��� �ڷḦ ������� �� �ִ�.
		Object[] oArr = {"a", "b", 1,2,3.0,5.1};
		// ���� for������ ����غ�����.
		for(Object oValue:oArr) {
			System.out.println(oValue);
		}
	}
}
