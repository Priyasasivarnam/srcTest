package A1_InterviewQuestions;

public class IntValue {
	public static void main(String[] args) {
		String a= "P1r2i3y4a5";
		String ab=a.replaceAll("[^0-9]", "");
		System.out.println(ab);
	}

}
