package A1_InterviewQuestions;

public class A14_RemoveDuplicates {
	public static void main(String[] args) {
		int a = 153;
		int result=0;
		while(a!=0) {
			int modules= (a%10);
			result+=(Math.pow(modules,3));
			a=a/10;
						
		}
		System.out.println(result);
	}

}
