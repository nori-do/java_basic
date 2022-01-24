package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		//Person t1 = new Teacher("나선생", 30, 3);
		//Person w1 = new Worker("직장인", 30, "대리");
		Teacher t1 = new Teacher("나선생", 30, 3);
		Worker w1 = new Worker("직장인", 30, "대리");
		
		t1.showPerson();
		System.out.println("-------------");
		w1.showPerson();
		System.out.println("-------------");
		t1.showTeacher();
		w1.showWorker();
				
	}
}
