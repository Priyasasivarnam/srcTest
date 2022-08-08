package A1_InterviewQuestions;

public class A11_Fibonic {
	public static void main(String[] args) {
		int fn = 0;
		int sn = 1;
		int result = 0;
		for(int i = 0;i<=5;i++) {
		result = fn;
		fn= sn;
		sn=fn+result;
		System.out.println(result);
		}	
	}

}
