package java_programme_basic;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a=15896;
		int reverseno=0;
		int temp=0;
		while(a>0) // we useing while condition
		{
			temp=a%10;
			reverseno=reverseno*10+temp;
			a=a/10;
		}
		System.out.println("Reverse of given number(a)is:"+reverseno);

	}

}
