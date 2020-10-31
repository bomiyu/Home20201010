package chap04.sec02.exam02_switch;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간:"+ time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근");
		}
	}
}
