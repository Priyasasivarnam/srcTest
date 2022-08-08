package A1_InterviewQuestions;

public class A13_ReverseNumber {
	public static void main(String[] args) {
		int a = 123456;
		int result = 0;
		while(a!=0) {
			int modules=(a%10);
			result  =(result * 10 +modules);
			a=a/10;
		}
		System.out.println(result);
			
		}
		
	
}
