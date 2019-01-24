package strings;

public class string1 {

	public static void main(String[] args) {
		String names = "John, Jennie, Jim, Jack, Joe";
		String s1 = names.substring(5);
		String s2 = names.substring(6, 11); // 6 inclusive and 11 exclusive| >=6 and < 11
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);

		int len = names.length();
		System.out.println("Length of names: "+len);
		
		char ch = names.charAt(names.length() - 1);
		System.out.println("ch is: "+ch);
		
		int idx = names.lastIndexOf('J');
		System.out.println("idx is: "+idx);
		
		char[] chArr = names.toCharArray();
		int JCount = 0;
		for(char chr : chArr){
			System.out.print(chr+"-");
			
			if(chr == 'J'){
				JCount++;
			}
		}
		System.out.println();
		System.out.println(JCount+" number of J's Found !!");
		
		
	
	}

}
