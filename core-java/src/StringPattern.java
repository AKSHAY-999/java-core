
public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Polo";
		String namePattern="[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(namePattern));
		
		String mobile="6338513089";
		String mobilePattern="[6-9]{1}[0-9]{9,}";
		System.out.println(mobile.matches(mobilePattern));
		
		String cc="4601331655009995";
		String ccPattern="[0-9]{16}";
		System.out.println(cc.matches(ccPattern));
		
		String email="aj@email.com";
		String emailPattern="[a-zA-Z0-9+_.]+@[a-zA-Z0-9.]+[a-z]{2,}";
		System.out.println(email.matches(emailPattern));

	}

}
