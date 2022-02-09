package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		//map자료형을 이용해 식당 메뉴판을 만들어보겠습니다.
		//key은 음식이름, value는 가격(정수)로 지정해주세요.
		//메뉴는 5개 이상 집어넣어주세요.
		//메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer>menu = new HashMap<>();
		
		menu.put("립스테이크바이트", 34900);
		menu.put("티본&쉬림프", 35900);
		menu.put("수퍼슈프림", 34900);
		menu.put("직화불고기", 24900);
		menu.put("더블치즈 티본스테이크", 21900);

		System.out.println("립스테이크바이트 가격 : " + menu.get("립스테이크바이트"));
		System.out.println("티본&쉬림프 가격 : "+ menu.get("티본&쉬림프"));
		System.out.println("직화불고기 가격 : " + menu.get("직화불고기"));
	}
}
