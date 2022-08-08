package A1_InterviewQuestions;

public class SpeacialCharactorRemoved {
	public static void main(String[] args) {
		String a = "v@c&ent4&ry";
		String ab=(a.replaceAll("[^a-z]", ""));
		System.out.println(ab);
	}

}
