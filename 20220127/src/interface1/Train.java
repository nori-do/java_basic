package interface1;

public class Train implements Vehicle {

	private int speed;
	private int gas;
	private String name;
	public Train(String name) {
		speed = 400;
		gas = 1000;
		this.name = name;
	}
	@Override
	public void accel() {
		//�ִ�ӷ� 400, �����ӵ� 100, ���� �Ҹ� 30
		if(speed + TRANIN_INCREASE_SPD > TRANIN_MAX_SPEED) {
			speed = TRANIN_MAX_SPEED;
		}else {
			speed += TRANIN_INCREASE_SPD;
		}
		gas -= TRANIN_DECREASE_GAS;
	}
	@Override
	public void breakSpeed() {
		// ���� 50
		if(speed - TRANIN_DECREASE_SPD < TRANIN_MIN_SPEED ) {
			speed = TRANIN_MIN_SPEED;
		}else {
			speed -= TRANIN_DECREASE_SPD;
		}
	}
	@Override
	public void reFuel() {
		//�ִ뿬�� 1000���� ���� 700
		if(gas + TRANIN_REFUEL_GAS > TRANIN_MAX_GAS) {
			gas = TRANIN_MAX_GAS;
		}else {
			gas += TRANIN_REFUEL_GAS;
		}
		
	}
	@Override
	public void showStatus() {
			System.out.println("���� �ӵ� : " + speed);
			System.out.println("���� ���ᷮ : " + gas);
			System.out.println("������ : " + name);
			System.out.println("-------------");
		}	
	}

	

