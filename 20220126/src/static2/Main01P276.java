package static2;

public class Main01P276 {

	public static void main(String[] args) {
		//Asean ���� ���� ���� ��ǥ������ �ֿܼ� ������.
		//System.out.println(Asean.presentationScore);
		System.out.println(Asean.getPresentationScore());
		Asean a1 = new Asean(20,50,40);
		Asean a2 = new Asean(40,70,30);
		Asean a3 = new Asean(50,80,70);
		Asean a4 = new Asean(90,80,90);
	
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
	
}
