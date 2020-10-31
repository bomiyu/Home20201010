package chap04.sec02.exam01_if;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = 95;
		System.out.println("점수:" + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {// score가 90이상일경우 다시 또 95이상이냐 아니냐~ else문까지 작성
				grade = "A+";

			} else {
				grade = "A";
			}
		}

		else {
			if (score >= 85) {
				grade = "B+";

			} else {
				grade = "B";
			}
		}
	}
}