package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "강아지";
		d1.age = 2;
		d1.gender = "암";
		d1.size = "대형";
		
		d1.howl();
		d1.getInfo();
	}
}
