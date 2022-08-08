package A1_InterviewQuestions;

public class A8_PanilromString {
	public static void main(String[] args) {
		String a = "malayalam";
		String ab= "";
		for(int i=a.length()-1;i>=0;i--) {
			ab=ab+a.charAt(i);
			
		}
		if(ab.equals(a)) {
			System.out.println("it is panilrom");
					}
		else {
			System.out.println("its not a panilrom");
		}
		
		
		
		
	}

}
