package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "������";
		d1.age = 2;
		d1.gender = "��";
		d1.size = "����";
		
		d1.howl();
		d1.getInfo();
	}
}
