package A1_InterviewQuestions;

public class A9_ReverseSpace {
	public static void main(String[] args) {
		String a = "i like coding";
		String str[]= a.split(" ");
		for(int i =0;i<str.length;i++) {
			for(int j = str[i].length()-1;j>=0;j--){
			System.out.print(str[i].charAt(j));
			//System.out.print(str[0]);
					
		}
			
	}
	}
}
