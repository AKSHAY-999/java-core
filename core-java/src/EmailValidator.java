
public class EmailValidator {
	//1 -only 1 occurance of @ and . is allowed
	//2. Min 4 char before @.
	//3. MIn 3 char between @ and .
	//4. min 2 char after  .
	//5. regural expression or patterns not allowed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="akshay@email.com";

		int countAt=0;
		int countDot=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				countAt++;
			}
			if(email.charAt(i)=='.') {
				countDot++;
			}
		}
		int indexOfAt = email.indexOf('@');
        int IndexOfDot = email.indexOf('.');
		if((countDot==1) && (countAt==1) &&(indexOfAt>=4)&&(IndexOfDot-indexOfAt-1 >=3)&&(email.length()-IndexOfDot-1>=2)){
			System.out.println("Valid Email");				
			}
		else {
			System.out.println("Invalid Email");
		}
	}
}
