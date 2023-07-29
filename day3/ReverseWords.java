package week1.day3;

public class ReverseWords {

	public static void main(String[] args) {
		String name="Mohammed";
		char[] ch=name.toCharArray();
		
		for (int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
