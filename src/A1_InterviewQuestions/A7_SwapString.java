package A1_InterviewQuestions;

public class A7_SwapString {
	public static void main(String[] args) {
		String a = "vcentry";
		String b = "technology";
		a=a+b;
		b= a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(b);
		System.out.println(a);			
		}
	}


