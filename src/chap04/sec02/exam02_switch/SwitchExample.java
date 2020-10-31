package chap04.sec02.exam02_switch;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // 1~6사이의 정수

		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
			
		}
	}
}
