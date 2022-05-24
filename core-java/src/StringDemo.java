
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";              //String Poool
		String s2=new String("Hello");  //Heap memory area
		String s3="Hello";              //Strig pool
		
		//Comparing memory laocation
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//Comapring values of String
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1=s1+"World";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace('o', 'a'));
		
		String week="Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days=week.split("-");
		for(String day:days) {
			System.out.println(day);
		}
		
		//There are 3'l' in 'HelloWorld' print index of all 3 'l's
		int index=s1.indexOf('l');
		while(index>=0) {
			System.out.print(index+" ");
			index=s1.indexOf('l',index+1);
		}
		
	

	}

}
