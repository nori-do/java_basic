package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		//Person t1 = new Teacher("������", 30, 3);
		//Person w1 = new Worker("������", 30, "�븮");
		Teacher t1 = new Teacher("������", 30, 3);
		Worker w1 = new Worker("������", 30, "�븮");
		
		t1.showPerson();
		System.out.println("-------------");
		w1.showPerson();
		System.out.println("-------------");
		t1.showTeacher();
		w1.showWorker();
				
	}
}
