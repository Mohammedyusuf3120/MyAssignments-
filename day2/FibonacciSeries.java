package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f1=0,f2=1,f3,i,count=7;
		System.out.println(f1);
		System.out.println(f2);
		for (i=1;i<count;++i) {
			f3=f2+f1;
			System.out.println(""+f3);
			f1=f2;
			f2=f3;
		}
	}

}
