package chap04.sec02.exam02_switch;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			break;
		case 'a':
			System.out.println("우수 회원입니다");
			break;
		case 'B':
		case 'b':
		default:
		}
	}
}
